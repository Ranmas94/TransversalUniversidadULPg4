/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniversidadULP.AccesoADatos;

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
public class MateriaData {
    private Connection con = null;
     
      public MateriaData(){
        con = Conexion.getConexion();
    }
       //Guardar materia
      public void guardarMateria(Materia materia){
         String sql = "INSERT INTO materia (nombre, anioMateria, estado) "
                 + "VALUES (?,?,?) ";
         
         try {
             PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             
             ps.setString(1, materia.getNombre());
             ps.setInt(2, materia.getAnioMateria());
             ps.setBoolean(3, materia.isActivo());
             
             ps.executeUpdate();
             
             ResultSet rs = ps.getGeneratedKeys();
             while(rs.next()){
                 materia.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Materia guardada");
             }
             
             ps.close();
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia"+ ex);
         }
     }
       //Buscar materia por id
     public Materia buscarMateria(int idInscripcion){
         String sql ="SELECT nombre,anioMateria, estado FROM Materia WHERE idInscripcion = ?";
         
         Materia mat = null;
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, idInscripcion);
              ResultSet rs = ps.executeQuery();
              
              if(rs.next()){
                  mat = new Materia();
                  mat.setIdInscripcion(rs.getInt("nombre"));
                  mat.setAnioMateria(rs.getInt("anioMateria"));
                  mat.setActivo(rs.getBoolean("estado"));
                  
              }else{
                  JOptionPane.showMessageDialog(null,"No se econtró la materia");
              }
             
             ps.close();
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia"+ ex);
         }
         return mat;
     }
     //Modificar Materia
      public void modificarMateria(Materia materia){
          String sql = "UPDATE materia SET nombre=?,anioMateria=?,estado=? WHERE idInscripcion = ? ";
          
         try {
             PreparedStatement ps = con.prepareStatement(sql);
              
             ps.setString(1, materia.getNombre());
             ps.setInt(2, materia.getAnioMateria());
             ps.setBoolean(3, materia.isActivo());
             
            int exito = ps.executeUpdate();
            if(exito == 1){
                 JOptionPane.showMessageDialog(null, "Materia modificada");
            }
            
            ps.close();
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia"+ ex);
         }
          
      }
      //Eliminar materia de DB
       public void borrarMateria(int idInscrpcion){
           String sql = "DELETE FROM materia WHERE idInscrpcion = ?";
           
         
         try {
              PreparedStatement ps= con.prepareStatement(sql);
              ps.setInt(1, idInscrpcion);
              int exito = ps.executeUpdate();
               if(exito == 1){
                 JOptionPane.showMessageDialog(null, "Materia eliminada!");
            }
            
            ps.close();
             
         } catch (SQLException ex) {
             Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
         }
          
       }
        //listar materias
      public List<Materia> listarMaterias(){
          String sql = "SELECT idInscripcion,nombre, anioMateria, estado FROM Materia WHERE estado = 1";
          ArrayList<Materia> materias = new ArrayList<>();
          
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             
             while(rs.next()){
                  Materia mat = new Materia();
                  mat.setIdInscripcion(rs.getInt("idInscripcion"));
                  mat.setNombre(rs.getString("nombre"));
                  mat.setAnioMateria(rs.getInt("anioMateria"));
                  mat.setActivo(true);
                  
                  materias.add(mat);
             }
             
             ps.close();
             
         } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia"+ ex);
         }
         return materias;  
      }
      
     
      
}
