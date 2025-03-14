/**
 *  Asiento.java
 *  Alberto Álvarez y Samuel Rodriguez (02/2025)
 * 
 */

package practica1_tp;

public class Asiento {
    private Viajero viajero;
    private int numero;
    private int fila;
    private int columna;

    public Asiento(int numero, int fila, int columna) {
        this.numero = numero;
        this.fila = fila;
        this.columna = columna;
    }

    public void asignarAsiento (Viajero viajero) {
        if (this.viajero == null) {
            this.viajero = viajero;
        }
        else {
            System.out.println("Asiento " + numero + " no disponible");
        }
    }

    public void liberarAsiento () {
        if (this.viajero != null) {
            this.viajero = null;
            System.out.println("Asiento " + numero + " liberado");
        }
        else {
            System.out.println("Asiento " + numero + " no ocupado");
        }
    }

    public int obtenerNumero() {
        return numero;
    }

    public Viajero obtenerViajero() {
        return viajero;
    }

    public boolean estaVacio(){

        return (this.viajero == null);
    }
    @Override
    public String toString(){

        return "\nN de asiento: " + numero + " " + viajero.toString();
    }
}
