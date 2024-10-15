
package UniversidadULP.AccesoADatos;

import UniversidadULP.Entidades.Alumno;
import UniversidadULP.Entidades.Inscripcion;
import UniversidadULP.Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Stefani Escobar
 */
public class InscripcionData {
    private Connection con = null;
    private AlumnoData aluData = new AlumnoData();
    private MateriaData matData = new MateriaData();
    
    public InscripcionData(){
        con = Conexion.getConexion();
    }
    
//Guardar Inscripcion
      public void guardarInscripcion(Inscripcion insc) {
         String sql = "INSERT INTO inscripcion (nota, idMateria,idAlumno) "
                 + "VALUES (?,?,?) ";
         
         try {
             PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             
             
             ps.setInt(1, 0);
             ps.setInt(2, insc.getMateria().getIdMateria());
             ps.setInt(3, insc.getAlumno().getIdAlumno());
             
             
             
             ps.executeUpdate();
             
             ResultSet rs = ps.getGeneratedKeys();
             while(rs.next()){
                 insc.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"El Alumno ha sido inscripto exitosamente.");
             }
             
              ps.close();
             rs.close();
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error al guardar alumno ."+ ex);
         }
     }
      

//Actualizar nota
      public void actualizarNota(int idAlumno, int idMateria, double nota){
          String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
          
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            
            int filas = ps.executeUpdate();
            if(filas>0){
                JOptionPane.showMessageDialog(null,"Nota actualizada");
            }
            ps.close();
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,"Error al actualizar. "+ ex);
        }
          
          
      }
      
//Borrar inscripcion
      public void borrarInscripcion(int idAlumno, int idMateria){
          String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
          
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            
            int filas = ps.executeUpdate();
            if(filas>0){
                JOptionPane.showMessageDialog(null,"Inscripción eliminada. ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al eliminar la inscripcion. "+ ex);
        }
      }
      
//obtener Materias Cursadas
      
      public List<Materia> obtenerMateriasCursadas(int id){
      List<Materia> materias = new ArrayList<Materia>();
      

        String sql = "SELECT inscripcion.idMateria, nombre, anio FROM inscripcion "
        + ",materia WHERE inscripcion.idMateria  =materia.idMateria "
        + "AND inscripcion.idAlumno = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            
            while (rs.next()){
            materia = new Materia();
            materia.setIdMateria(rs.getInt("idMateria"));
            materia.setNombre(rs.getString("nombre"));
            materia.setAnioMateria(rs.getInt("anio"));
            materias.add(materia);  
        }
             ps.close();
             rs.close();
      } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones."+ex.getMessage());
        }
      return materias;
      }
      
//obtener Materias NO Cursadas
      
      public List<Materia> obtenerMateriasNoCursadas(int id){
      List<Materia> materias = new ArrayList<Materia>();
      

    String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria not in"
            + " (SELECT idMateria FROM inscripcion WHERE idAlumno = ?)"; 
                    
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            
            while (rs.next()){
            materia = new Materia();
            materia.setIdMateria(rs.getInt("idMateria"));
            materia.setNombre(rs.getString("nombre"));
            materia.setAnioMateria(rs.getInt("anio"));
            
            materias.add(materia);  
        }
            ps.close();
             rs.close();
      } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones."+ex.getMessage());
        }
      return materias;
      }
      
//Obtener Inscripciones      
      public List<Inscripcion> obtenerInscripciones() {
        String sql = "SELECT * FROM inscripcion";
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Inscripcion insc = new Inscripcion();
            insc.setIdMateria(rs.getInt("idInscripto"));
            Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno"));
            Materia mat = matData.buscarMateria(rs.getInt("idMateria"));
            
            insc.setAlumno(alu);
            insc.setMateria(mat);
            insc.setNota(rs.getDouble("nota"));
            
            inscripciones.add(insc);
            
        }
        ps.close();
        rs.close();
        } catch (SQLException ex) {

             JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones."+ex);
        }

        return inscripciones;
        }
      
 //Inscripciones por alumno
      public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno){
          String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idAlumno);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Inscripcion insc = new Inscripcion();
            insc.setIdMateria(rs.getInt("idInscripto"));
            Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno"));
            Materia mat = matData.buscarMateria(rs.getInt("idMateria"));
            
            insc.setAlumno(alu);
            insc.setMateria(mat);
            insc.setNota(rs.getDouble("nota"));
            
            inscripciones.add(insc);
            
        }
        ps.close();
        rs.close();
        } catch (SQLException ex) {

             JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones."+ex);
        }

        return inscripciones;
      }
    
      
 //Obtener alumnos x materia
      public List<Alumno> obtenerAlumnosxMateria (int idMateria){
          ArrayList<Alumno> alumnosMateria = new ArrayList<>();
          String sql = "SELECT a.idAlumno, dni, nombre, apellido, fechadeNacimiento, estado "
                  + "FROM inscripcion i, alumno a "
                  + "WHERE i.idAlumno = a.idAlumno AND idMateria = ?";
          
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Alumno alumno = new Alumno();
                alumno.setDni(rs.getInt("dni"));
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechadeNacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                
                alumnosMateria.add(alumno);
                
            }
            ps.close();
             rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener AlumnoxMateria. "+ex);
        }
        return alumnosMateria;
          
      }
}
