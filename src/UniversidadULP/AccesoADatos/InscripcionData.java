
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Stefani Escobar
 */
public class InscripcionData {
    private Connection con = null;
    private AlumnoData aluData;
    private MateriaData matData;
    
    public InscripcionData(){
        con = Conexion.getConexion();
    }
    
//Guardar Inscripcion
      public void guardarInscripcion(Inscripcion insc) {
         String sql = "INSERT INTO inscripcion (alumno, materia, nota) "
                 + "VALUES (?,?,?) ";
         
         try {
             PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             
             
             ps.setInt(1, insc.getAlumno().getIdAlumno());
             ps.setInt(2, insc.getMateria().getIdInscripcion());
             ps.setDouble(3, insc.getNota());
             
             ps.executeUpdate();
             
             ResultSet rs = ps.getGeneratedKeys();
             while(rs.next()){
                 insc.setInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"El Alumno ha sido inscripto exitosamente.");
             }
             
             ps.close();
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Incripción."+ ex);
         }
     }
      

//obtener Materias Cursadas
      
      public List<Materia> obtenerMateriasCursadas(int id){
      List<Materia> materias = new ArrayList<Materia>();
      try{

        String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripción "
        + "JOIN materia ON(inscripción.idMateria=materia.idMateria) "
        + "WHERE inscripcion.idAlumno = ?";
        
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            
            while (rs.next()){
            materia = new Materia();
            materia.setIdInscripcion(rs.getInt("idIncripcion"));
            materia.setNombre(rs.getString("nombre"));
            materia.setAnioMateria(rs.getInt("año"));
            materias.add(materia);  
        }
            ps.close();
      } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones."+ex.getMessage());
        }
      return materias;
      }
      
//obtener Materias NO Cursadas
      
      public List<Materia> obtenerMateriasNoCursadas(int id){
      List<Materia> materias = new ArrayList<Materia>();
      try{

    String sql = "SELECT materia.idMateria, nombre, año " +
                     "FROM materia " +
                     "WHERE materia.idMateria NOT IN (" +
                     "  SELECT inscripcion.idMateria " +
                     "  FROM inscripcion " +
                     "  WHERE inscripcion.idAlumno = ?" + ")";
        
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            
            while (rs.next()){
            materia = new Materia();
            materia.setIdInscripcion(rs.getInt("idIncripcion"));
            materia.setNombre(rs.getString("nombre"));
            materia.setAnioMateria(rs.getInt("año"));
            
            materias.add(materia);  
        }
            ps.close();
      } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones."+ex.getMessage());
        }
      return materias;
      }
      
//Obtener Inscripciones      
      public List<Inscripcion> obtenerInscripciones() {
        String sql = "SELECT inscripcion,alumno, materia, nota FROM Inscripcion";
        List<Inscripcion> inscripciones = new ArrayList<>();
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Inscripcion insc = new Inscripcion();
            insc.setInscripcion(rs.getInt("Inscripcion"));
            insc. setAlumno(rs.getInt("Alumno")); //No estoy muy segura del setAlumno
            insc.setMateria(rs.getInt("Materia")); //No estoy muy segura del setMateria
            insc.setNota(rs.getDouble("Nota"));
       
            inscripciones.add(insc);
        }
        ps.close();
        } catch (SQLException ex) {

             JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones."+ex);
        }

        return inscripciones;
        }
    
}
