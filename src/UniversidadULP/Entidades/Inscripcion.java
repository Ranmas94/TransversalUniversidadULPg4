/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UniversidadULP.Entidades;

/**
 *
 * @author Ranma
 */
public class Inscripcion {
    private int idMateria;
    private Alumno alumno;
    private Materia materia;
    private double nota;

    // Constructor vacío
    public Inscripcion() {
    }

    // Constructor con todos los atributos
    public Inscripcion(int idMateria, Alumno alumno, Materia materia, double nota) {
        this.idMateria = idMateria;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    
    
    public Inscripcion(Alumno alumno, Materia materia, double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
         this.nota = 0;
    
    }
    
    

    // Getters y Setters
    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Método toString
    @Override
    public String toString() {
        return "Inscripcion{" +
                "inscripcion=" + idMateria +
                ", alumno=" + alumno +
                ", materia=" + materia +
                ", nota=" + nota +
                '}';
    }
}

