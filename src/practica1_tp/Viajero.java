/**
 *  Viajero.java
 *  Alberto Álvarez y Samuel Rodriguez (02/2025)
 * 
 */

package practica1_tp;

abstract class Viajero {
    private String nombre;
    private String apellido;
    private String dni;

    public Viajero(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    
    public void obtenerOcupacion(){
        
    }
    
    public void generarHojaViaje(){
        
    }
}
