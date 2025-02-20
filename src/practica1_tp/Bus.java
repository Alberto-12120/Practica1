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
        int index = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (asientos[i][j] != null && asientos[i][j].getViajero() != null) {
                    listado[index] = "Viajero: " + asientos[i][j].getViajero().getNombre() + ", Asiento: " + asientos[i][j].getNumero();
                    index++;
                }
            }
        }
        return listado;
    }
}
