/**
 *  Viaje.java
 *  Alberto Álvarez y Samuel Rodriguez (02/2025)
 * 
 */

package practica1_tp;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Viaje {
    private String codigo;
    private String origen;
    private String destino;
    private LocalDate fecha;
    private LocalTime hora;
    private Bus bus;

    /*
     * Constructor que lee la información de una línea específica de un archivo de texto
     * 
     * Construye un viaje
     */
 
    public Viaje(String archivo, int numeroLinea) {
        try {
            File archivoViaje = new File(archivo);
            Scanner scannerViaje = new Scanner(archivoViaje);

            int lineaActual = 0;
            while (scannerViaje.hasNextLine()) {
                lineaActual++;
                String linea = scannerViaje.nextLine();
                if (lineaActual == numeroLinea) {
                    Scanner lineaScanner = new Scanner(linea);
                    this.codigo = lineaScanner.next();
                    this.origen = lineaScanner.next();
                    this.destino = lineaScanner.next();
                    this.fecha = LocalDate.parse(lineaScanner.next());
                    this.hora = LocalTime.parse(lineaScanner.next());
                    this.bus = new Bus(); // Asumiendo que tienes un constructor por defecto en la clase Bus
                    lineaScanner.close();
                    break;
                }
            }
            scannerViaje.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo " + archivo + " no encontrado.");
        }
    }

    /*
     * public void obtenerOcupacion(){
     * try{
     * File archivoViaje = new File("Viaje.txt");
     * Scanner scannerViaje = new Scanner(archivoViaje);
     * 
     * while (scannerViaje.hasNextLine()){
     * codigo = scannerViaje.next();
     * origen = scannerViaje.next();
     * destino = scannerViaje.next();
     * Bus bus = new Bus();
     * }
     * System.out.println(origen + "-" + destino);
     * }
     * catch (FileNotFoundException e) {
     * System.out.println("Archivo Viaje.txt no encontrado.");
     * }
     * 
     * }
     */

    public void generarHojaViaje() {

    }

    public void asignarAsientos() {

    }

}
