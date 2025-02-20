/**
 *  Asiento.java
 *  Alberto Álvarez y Samuel Rodriguez (02/2025)
 * 
 */

package practica1_tp;

public class Asiento {
    private Viajero viajero;
    private String numero;
    private int fila;
    private int columna;

    public Asiento(String numero, int fila, int columna) {
        this.numero = numero;
        this.fila = fila;
        this.columna = columna;
    }

    public void asignarAsiento (Viajero viajero, String numero) {
        if (viajero == null) {
            this.viajero = viajero;
            System.out.println("Asiento " + numero + " asignado a " + viajero);
        }
        else {
            System.out.println("Asiento " + numero + " no disponible");
        }
    }

    public void liberarAsiento (Viajero viajero, String numero) {
        if (viajero != null) {
            this.viajero = null;
            System.out.println("Asiento " + numero + " liberado");
        }
        else {
            System.out.println("Asiento " + numero + " no ocupado");
        }
    }
}
