/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UniversidadULP.AccesoADatos;
import java.sql.PreparedStatement;
import UniversidadULP.Entidades.Alumno;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 *
 * @author Lourdes
 */
public class AlumnoData {
     private Connection con = null;
     
      public AlumnoData(){
        con = Conexion.getConexion();
    }
      
      //Guardar alumno
      
     public void guardarAlumno(Alumno alumno){
         String sql = "INSERT INTO alumno(dni, apellido, nombre, fechadeNacimiento, estado) "
                 + "VALUES (?,?,?,?,?) ";
         
         try {
             PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             
             ps.setInt(1, alumno.getDni());
             ps.setString(2, alumno.getApellido());
             ps.setString(3, alumno.getNombre());
             ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
             ps.setBoolean(5, alumno.isActivo());
             
             ps.executeUpdate();
             
             ResultSet rs = ps.getGeneratedKeys();
             while(rs.next()){
                 alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Alumno guardado");
             }
             
              ps.close();
             rs.close();
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno"+ ex);
         }
     }
     
     //Buscar alumno por dni
     public Alumno buscarAlumno(int dni){
         String sql ="SELECT * FROM alumno WHERE dni = ?";
         
         Alumno al = null;
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, dni);
              ResultSet rs = ps.executeQuery();
              
              if(rs.next()){
                 al = new Alumno();
                 
                  al.setIdAlumno(rs.getInt("idAlumno"));
                  al.setDni(dni);
                  al.setApellido(rs.getString("apellido"));
                  al.setNombre(rs.getString("nombre"));
                  al.setFechaNac(rs.getDate("fechadeNacimiento").toLocalDate());
                  al.setActivo(rs.getBoolean("estado"));
                  
              }else{
                  JOptionPane.showMessageDialog(null,"No se encontró el alumno por dni");
              }
             
             rs.close();  // Cerrar el ResultSet
             ps.close();
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno"+ ex);
         }
         return al;
     }
     
     //Buscar alumno por id
      public Alumno buscarAlumnoId(int id){
         String sql ="SELECT dni,apellido, nombre, fechadeNacimiento, estado FROM alumno WHERE idAlumno= ?";
         
         Alumno al = null;
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, id);
              ResultSet rs = ps.executeQuery();
              
              if(rs.next()){
                 al = new Alumno();
                  al.setDni(rs.getInt("dni"));
                  al.setApellido(rs.getString("apellido"));
                  al.setNombre(rs.getString("nombre"));
                  al.setFechaNac(rs.getDate("fechadeNacimiento").toLocalDate());
                  al.setActivo(rs.getBoolean("estado"));
                  
              }else{
                  JOptionPane.showMessageDialog(null,"No se encontró el alumno");
              }
             
              ps.close();
             rs.close();
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno"+ ex);
         }
         return al;
     }
      
      //listar alumnos
      public List<Alumno> listarAlumnos(){
          String sql = "SELECT idAlumno,dni,apellido, nombre, fechadeNacimiento, estado FROM alumno WHERE estado = 1";
          ArrayList<Alumno> alumnos = new ArrayList<>();
          
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             
             while(rs.next()){
                 Alumno al = new Alumno();
                 al.setIdAlumno(rs.getInt("idAlumno"));
                  al.setDni(rs.getInt("dni"));
                  al.setApellido(rs.getString("apellido"));
                  al.setNombre(rs.getString("nombre"));
                  al.setFechaNac(rs.getDate("fechadeNacimiento").toLocalDate());
                  al.setActivo(true);
                  
                  alumnos.add(al);
             }
             
              ps.close();
             rs.close();
             
         } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno"+ ex);
         }
         return alumnos;  
      }
      
      //Modificar Alumno
      public void modificarAlumno(Alumno alumno){
          String sql = "UPDATE alumno SET dni=?,apellido=?,nombre=?,fechadeNacimiento=?,estado=? WHERE idAlumno = ? ";
          
         try {
             PreparedStatement ps = con.prepareStatement(sql);
              
             ps.setInt(1, alumno.getDni());
             ps.setString(2, alumno.getApellido());
             ps.setString(3, alumno.getNombre());
             ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
             ps.setBoolean(5, alumno.isActivo());
             
            int exito = ps.executeUpdate();
            if(exito == 1){
                 JOptionPane.showMessageDialog(null, "alumno modificado");
            }
            
            ps.close();
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno"+ ex);
         }
          
      }
      
      //Dar de baja
      public void bajaAlumno(int id){
          String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ?";
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1,id);
             int exito = ps.executeUpdate();
            if(exito == 1){
                 JOptionPane.showMessageDialog(null, "alumno dado de baja");
            }
            
            ps.close();
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error al dar de baja a alumno"+ ex);
         }
      }
      
      //Dar de alta
       public void altaAlumno(int id){
          String sql = "UPDATE alumno SET estado = 1 WHERE idAlumno = ?";
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1,id);
             int exito = ps.executeUpdate();
            if(exito == 1){
                 JOptionPane.showMessageDialog(null, "alumno dado de alta");
            }
            
            ps.close();
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error al dar de alta a alumno"+ ex);
         }
      }
       
       //Borrar alumno de DB
       public void borrarAlumno(int id){
           String sql = "DELETE FROM alumno WHERE idAlumno = ?";
           
         
         try {
              PreparedStatement ps= con.prepareStatement(sql);
              ps.setInt(1, id);
              int exito = ps.executeUpdate();
               if(exito == 1){
                 JOptionPane.showMessageDialog(null, "alumno eliminado");
            }
            
            ps.close();
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error al borrar alumno"+ ex);
         }
          
       }
}
