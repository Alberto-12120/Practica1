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
        try {  /*
                    
          //Prototipo 1
          Bus[] bus = new Bus[999];

          File archivoBus = new File("Bus.txt");
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

          File archivoViaje = new File("Viaje.txt");
          Scanner scannerViaje = new Scanner(archivoViaje);
          int k = 0;
          while (scannerViaje.hasNextLine()) {
            String codigo = scannerViaje.next();
            String origen = scannerViaje.next();
            String destino = scannerViaje.next();
            int numeroBus = scannerViaje.nextInt();
            LocalDate fecha = LocalDate.parse(scannerViaje.next());
            LocalTime hora = LocalTime.parse(scannerViaje.next());
            viaje[k] = new Viaje(codigo, origen, destino,fecha, hora, bus[numeroBus]);
            k++;
          }
          scannerViaje.close();

          //Prototipo 2
          viaje[1].asignarAsiento(new Viajero("Samuel", "Rodriguez", "73411103W"), 5);
          viaje[2].asignarAsiento(new Viajero("Samuel", "Rodriguez", "73411103W"), 8);
        
          viaje[1].obtenerOcupacion(numeroBus);
          */

           //Prototipo 3
          //---------------------------------------------------
          
          Scanner scannerViajes = new Scanner(new File("Viaje.txt"));

          Viaje viaje1 = new Viaje(scannerViajes, new Bus("Bus.txt"));
          Viaje viaje2 = new Viaje(scannerViajes, new Bus("Bus.txt"));
   
          scannerViajes.close();

          viaje1.asignarAsiento(new Viajero("Samuel", "Rodriguez", "73411103W"), 5);
          viaje2.asignarAsiento(new Viajero("Samuel", "Rodriguez", "73411103W"), 8);

          System.out.println(viaje1.obtenerOcupacion());  
          System.out.println(viaje2.obtenerOcupacion());

          viaje1.generarHojaViaje("hoja_viaje1.txt");
          viaje2.generarHojaViaje("hoja_viaje2.txt");

        } 
        catch(Exception e) {
          System.out.println(e);
          e.printStackTrace();
        }
      }  
    }

