/**
 *  Viajero.java
 *  Alberto Álvarez (02/2025)
 * 
 */

package practica1_tp;

public class Viajero {
    private String nombre;
    private String apellido;
    private String dni;

    public Viajero(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }

}
