/**
 *  Asiento.java
 *  Alberto Álvarez (02/2025)
 * 
 */

package practica1_tp;

public class Asiento {
    private Viajero viajero;
    private int numero;

    public Asiento(int numero) {
        this.numero = numero;
    }

    public boolean asignarAsiento(Viajero viajero) {
        if (this.viajero == null) {
            this.viajero = viajero;
            return true;
        } else {
            return false;
        }
    }

    public int obtenerNumero() {
        return numero;
    }

    public Viajero obtenerViajero() {
        return viajero;
    }

    public boolean estaVacio() {

        return (this.viajero == null);
    }

    @Override
    public String toString() {
        return "\nN de asiento: " + numero + " " + viajero.toString();
    }
}
