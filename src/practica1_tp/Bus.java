/**
 *  Bus.java
 *  Alberto Álvarez y Samuel Rodriguez (02/2025)
 * 
 */

package practica1_tp;

import java.io.File;
import java.util.Scanner;

public class Bus {
    private String codigo;
    private int filas;
    private int columnas;
    private Asiento[] asiento;

    
    
    //Construye el bus
    public Bus(String archivo){
        Scanner scannerBus = new Scanner(archivo);
        while (scannerBus.hasNextLine()) {
            System.out.println(scannerBus.nextLine());
            System.out.println(scannerBus.nextLine());
            this.filas = Integer.parseInt(scannerBus.next());
            this.columnas = scannerBus.nextInt();
            this.asiento = new Asiento[filas];
            for (int k = 0; k < filas; k++) {
                int numeroAsiento = scannerBus.nextInt();
                int filaAsiento = scannerBus.nextInt(); 
                int columnaAsiento = scannerBus.nextInt();
                this.asiento[k] = new Asiento(numeroAsiento, filaAsiento, columnaAsiento);
            }
          }
          scannerBus.close();
    }

    public void asignarAsiento(Viajero viajero, int numero){
        asiento[numero].asignarAsiento(viajero);
    }

    public void obtenerOcupacion(){
        for (int i = 0; i < asiento.length; i++){
            if (asiento[i].obtenerViajero() != null){
                if (asiento[i].obtenerNumero() >= 10){
                    System.out.println("(" + asiento[i].obtenerNumero() + ")");
                }
                else {
                    System.out.println("(0" + asiento[i].obtenerNumero() + ")");
                }
            }
            else{
                if (asiento[i].obtenerNumero() >= 10){
                    System.out.println(asiento[i].obtenerNumero());
                }
                else {
                    System.out.println("0" + asiento[i].obtenerNumero());
                }
            }
        }

    }
    public Asiento[] getAsiento() {
        return asiento;
    }

    @Override
    public String toString() {
        String cadena = "";

        for (int i = 0; i < this.asiento.length; i++) {
            if (!this.asiento[i].estaVacio()) {
                cadena += this.asiento[i].toString();
            }
        }
        return cadena;
    }

    /*
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
    */


   
}
