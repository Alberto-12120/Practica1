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
          Asiento[] asiento = new Asiento[999];

          File archivoBus = new File("viajes.txt");
          Scanner scannerBus = new Scanner(archivoBus);
          int filas = scannerBus.nextInt();
          int columnas = scannerBus.nextInt();
          int j = 0;
          while (scannerBus.hasNextLine()) {
            String numeroAsiento = scannerBus.next();
            int filaAsiento = scannerBus.nextInt(); 
            int columnaAsiento = scannerBus.nextInt();
            asiento[j] = new Asiento(numeroAsiento, filaAsiento, columnaAsiento);
            j++;
            scannerBus.close();
          }   

          Viaje[] viaje = new Viaje[999];

          File archivoViaje = new File("viajes.txt");
          Scanner scannerViaje = new Scanner(archivoViaje);
          int i = 0;
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
            viaje[i] = new Viaje(codigo, origen, destino, dia, mes, año, hora, minuto, bus[numeroBus]);
            i++;
            scannerViaje.close();
          }
          
          //Prototipo 2
          viaje[1].asignarAsiento(new Viajero("Samuel", "Rodriguez", "73411103W"), "05");
          viaje[2].asignarAsiento(new Viajero("Samuel", "Rodriguez", "73411103W"), "08");
        
          viaje[1].obtenerOcupacion();

          //Prototipo 3
          viaje1.generarHoja(...);

        } 
        catch(Exception e) {
          System.out.println(e);
        }
      }  
    }

