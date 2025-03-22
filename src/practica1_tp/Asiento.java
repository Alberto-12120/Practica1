/**
 *  Asiento.java
 *  Alberto Álvarez (02/2025)
 * 
 */

package practica1_tp;

public class Asiento {
    private Viajero viajero;
    private int numero;
    private String enunciadoAsiento = "\nN de asiento: ";
    private String espacio = " ";

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
        return enunciadoAsiento + numero + espacio + viajero.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Asiento asiento = (Asiento) obj;
        return numero == asiento.numero;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(numero);
    }
}
