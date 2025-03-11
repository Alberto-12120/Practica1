/**
 *  Bus.java
 *  Alberto Álvarez y Samuel Rodriguez (02/2025)
 * 
 */

package practica1_tp;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Bus {
    private String codigo;
    private int filas;
    private int columnas;
    private Asiento[] asientos;
    private int tamanyoAsientos;
    private Asiento[][] matrizAsientos;

    
    
    //Construye el bus
    public Bus(String archivo){

        try {
            //leer filas y columnas para inicializar matriz, orden filas y luego columnas, new Asiento[fila][columna] 
            // para esta posicion x y asigname el codigo que leas, cambiar el for, para asignar al asiento i j
            Scanner scannerBus = new Scanner(new FileInputStream(archivo));
            while (scannerBus.hasNextLine()) {
                this.filas = Integer.parseInt(scannerBus.next());
                this.columnas = scannerBus.nextInt();
                this.tamanyoAsientos = filas * columnas;
                this.matrizAsientos = new Asiento[filas][columnas];
                for(int i = 0; i < filas; i++){
                    for(int j = 0; j < columnas; j++){
                        int numeroAsiento = scannerBus.nextInt();
                        int filaAsiento = scannerBus.nextInt();
                        int columnaAsiento = scannerBus.nextInt();
                        this.matrizAsientos[i][j] = new Asiento(numeroAsiento, filaAsiento, columnaAsiento);
                    }
                }

                /*for (int i = 1; i <= tamanyoAsientos; i++) {
                    int numeroAsiento = scannerBus.nextInt();
                    int filaAsiento = scannerBus.nextInt(); 
                    int columnaAsiento = scannerBus.nextInt();
                    this.asientos[i] = new Asiento(numeroAsiento, filaAsiento, columnaAsiento);
                }*/
              }
              scannerBus.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }

    public void asignarAsiento(Viajero viajero, int numero){
        asientos[numero].asignarAsiento(viajero);
    }

    
    public void obtenerOcupacion(){
        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                if (this.matrizAsientos[i][j] != null && !this.matrizAsientos[i][j].estaVacio()) {
                    System.out.print("(" + this.matrizAsientos[i][j].obtenerNumero() + ") ");
                } else if (this.matrizAsientos[i][j] != null && this.matrizAsientos[i][j].estaVacio()) {
                    System.out.print(this.matrizAsientos[i][j].obtenerNumero() + " ");
                } else {
                    System.out.print("  ");
                } 
            }
            System.out.println();
        }
        System.out.println("(XX) - Asiento XX ocupado");
    }
        
    public Asiento[] getAsientos() {
        return asientos;
    }

    @Override
    public String toString() {
        String cadena = "";

        for (int i = 0; i < this.asientos.length; i++) {
            if (this.asientos[i] != null && !this.asientos[i].estaVacio()) {
                cadena += this.asientos[i].toString();
            }
        }
        return cadena;
    }

}
