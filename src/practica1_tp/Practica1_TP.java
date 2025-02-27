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
          
          Scanner scannerViajes = new Scanner(new File("Viaje.txt"));

          Viaje viaje1 = new Viaje(scannerViajes, new Bus("Bus.txt"));
          Viaje viaje2 = new Viaje(scannerViajes, new Bus("Bus.txt"));
   
          scannerViajes.close();

          viaje1.asignarAsiento(new Viajero("Samuel", "Rodriguez", "73411103W"), 5);
          viaje2.asignarAsiento(new Viajero("Samuel", "Rodriguez", "73411103W"), 8);

          System.out.println(viaje1.obtenerOcupacion());
          System.out.println(viaje2.obtenerOcupacion());

          //viaje1.generarHojaViaje("hoja_viaje1.txt");
          //viaje2.generarHojaViaje("hoja_viaje2.txt");
        } 
        catch(Exception e) {
          System.out.println(e);
          e.printStackTrace();
        }
      }  
    }

