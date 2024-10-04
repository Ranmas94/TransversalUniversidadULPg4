/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UniversidadULP.Vistas;

import UniversidadULP.AccesoADatos.AlumnoData;
import UniversidadULP.AccesoADatos.Conexion;
import UniversidadULP.Entidades.Alumno;
import java.sql.Connection;
import java.time.LocalDate;

/**
 *
 * @author Ranma
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Connection con = Conexion.getConexion();
        
        //Creamos alumnos con los datos de los integrantes del grupo
        Alumno al = new Alumno(23232323,"Escudero","Lourdes", LocalDate.parse("2001-10-28"),false);
        Alumno al1 = new Alumno(99887766,"Aguilera","Victor", LocalDate.parse("1991-11-01"),true);
        Alumno al2 = new Alumno(34567899,"Escobar","Estefani", LocalDate.parse("2000-03-24"),true);
        Alumno al3 = new Alumno(10101010,"Poblete","Dante", LocalDate.parse("2003-11-10"),false);
        Alumno al4 = new Alumno(99999999,"Grippo","Federico", LocalDate.parse("1999-04-14"),true);
        Alumno al5 = new Alumno(11110000,"Matilla","Maximiliano", LocalDate.parse("1999-05-12"),true);
        
        //Agregamos los alumnos a la base de datos a través de AlumnoData
        AlumnoData alumno = new AlumnoData();
        alumno.guardarAlumno(al);
        alumno.guardarAlumno(al1);
        alumno.guardarAlumno(al2);
        alumno.guardarAlumno(al3);
        alumno.guardarAlumno(al4);
        alumno.guardarAlumno(al5);
       
        
        
        //Mostramos por pantalla los alumnos agregados y que están activos
        for (Alumno alu:alumno.listarAlumnos()) {
            System.out.println(alu);
        }
        
       
    }
    
}
