/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UniversidadULP.Entidades;

/**
 *
 * @author Ranma
 */
public class Materia {
    private int idInscripcion;
    private String nombre;
    private int anioMateria;
    private boolean activo;

    // Constructor vacío
    public Materia() {
    }

    // Constructor con todos los atributos
    public Materia(int idInscripcion, String nombre, int anioMateria, boolean activo) {
        this.idInscripcion = idInscripcion;
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.activo = activo;
    }

    // Getters y Setters
    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioMateria() {
        return anioMateria;
    }

    public void setAnioMateria(int anioMateria) {
        this.anioMateria = anioMateria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Método toString para una representación de la clase
    @Override
    public String toString() {
        return "Materia{" +
                "idInscripcion=" + idInscripcion +
                ", nombre='" + nombre + '\'' +
                ", anioMateria=" + anioMateria +
                ", activo=" + activo +
                '}';
    }
}
