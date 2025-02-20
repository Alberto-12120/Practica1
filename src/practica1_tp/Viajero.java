/**
 *  Viajero.java
 *  Alberto Álvarez y Samuel Rodriguez (02/2025)
 * 
 */

package practica1_tp;

class Viajero {
    private String nombre;
    private String apellido;
    private String dni;

    public Viajero(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    // Getters y Setters para obtener el nombre del pasajero
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void obtenerOcupacion(){
        
    }
    
    public void generarHojaViaje(){
        
    }
}
