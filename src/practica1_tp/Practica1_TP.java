/**
 *  Practica1_TP.java
 *  Alberto Álvarez y Samuel Rodriguez (02/2025)
 * 
 */

package practica1_tp;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Practica1_TP {

    public static void main(String[] args) {
        try {  
          
          //Prototipo 1
          Bus[] bus = new Bus[999];

          File archivoBus = new File("viajes.txt");
          Scanner scannerBus = new Scanner(archivoBus);
          int i = 0;
          while (scannerBus.hasNextLine()) {
            String codigoBus = scannerBus.next();
            int filas = scannerBus.nextInt();
            int columnas = scannerBus.nextInt();
            Asiento[] asientos = new Asiento[filas];
            for (int k = 0; k < filas; k++) {
              int numeroAsiento = scannerBus.nextInt();
              int filaAsiento = scannerBus.nextInt(); 
              int columnaAsiento = scannerBus.nextInt();
              asientos[k] = new Asiento(numeroAsiento, filaAsiento, columnaAsiento);
            }   
            bus[i] = new Bus(codigoBus, filas, columnas, asientos);
          }
          scannerBus.close();

          Viaje[] viaje = new Viaje[999];

          File archivoViaje = new File("viajes.txt");
          Scanner scannerViaje = new Scanner(archivoViaje);
          int k = 0;
          while (scannerViaje.hasNextLine()) {
            String codigo = scannerViaje.next();
            String origen = scannerViaje.next();
            String destino = scannerViaje.next();
            int numeroBus = scannerViaje.nextInt();
            LocalDate dia = LocalDate.parse(scannerViaje.next());
            LocalDate mes = LocalDate.parse(scannerViaje.next());
            LocalDate año = LocalDate.parse(scannerViaje.next());
            LocalTime hora = LocalTime.parse(scannerViaje.next());
            LocalTime minuto = LocalTime.parse(scannerViaje.next());
            viaje[k] = new Viaje(codigo, origen, destino, dia, mes, año, hora, minuto, bus[numeroBus]);
            k++;
          }
          scannerViaje.close();

          //Prototipo 2
          viaje[1].asignarAsiento(new Viajero("Samuel", "Rodriguez", "73411103W"), "05");
          viaje[2].asignarAsiento(new Viajero("Samuel", "Rodriguez", "73411103W"), "08");
        
          viaje[1].obtenerOcupacion();

          //Prototipo 3
          viaje[1].generarHojaViaje();

        } 
        catch(Exception e) {
          System.out.println(e);
        }
      }  
    }

