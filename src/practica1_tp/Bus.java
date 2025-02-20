/**
 *  Bus.java
 *  Alberto Álvarez y Samuel Rodriguez (02/2025)
 * 
 */

package practica1_tp;

public class Bus {
    private String codigo;
    private int filas;
    private int columnas;
    private Asiento[] asiento;

    //Construye el bus
    public Bus(String codigo, int filas, int columnas, Asiento[] asiento){
        this.codigo = codigo;
        this.filas = filas;
        this.columnas = columnas;
        this.asiento = asiento;
    }

    public void asignarAsiento(Viajero viajero, int numero){
        asiento[numero].asignarAsiento(viajero);
    }

    public void obtenerOcupacion(){
        
    }

    //genera el listado de los viajeros en el bus
    public String[] obtenerListadoViajeros() {
        String[] listado = new String[contador];
        for (int i = 0; i < contador; i++) {
            listado[i] = "Viajero: " + viajeros[i].getNombre() + ", Asiento: " + asientos[i];
        }
        return listado;
    }
}
