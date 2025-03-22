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
    private String enunciadoNombre = "Nombre: ";

    public Viajero(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return enunciadoNombre + nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Viajero viajero = (Viajero) obj;
        return dni.equals(viajero.dni);
    }

    @Override
    public int hashCode() {
        return dni.hashCode();
    }

}
