/**
 *  Practica1_TP.java
 *  Alberto Álvarez (02/2025)
 * 
 */

package practica1_tp;

import java.io.File;
import java.util.Scanner;

public class Practica1_TP {

  public static void main(String[] args) {
    try {

      Scanner scannerViajes = new Scanner(new File("Viaje.txt"));

      Viaje viaje1 = new Viaje(scannerViajes, new Bus("Bus.txt"));
      Viaje viaje2 = new Viaje(scannerViajes, new Bus("Bus.txt"));

      scannerViajes.close();

      viaje1.asignarAsiento(new Viajero("Samuel", "Rodriguez", "73411103W"), 3);
      viaje1.asignarAsiento(new Viajero("Pepito", "Rodriguez", "73411103W"), 12);
      viaje1.asignarAsiento(new Viajero("Juan", "Rodriguez", "73411103W"), 44);
      viaje1.asignarAsiento(new Viajero("David", "Rodriguez", "73411103W"), 55);
      viaje2.asignarAsiento(new Viajero("Samuel", "Rodriguez", "73411103W"), 8);
      viaje2.asignarAsiento(new Viajero("Alberto", "Alavarez", "73411103W"), 12);
      
      String ocupacion = viaje1.obtenerOcupacion();
      System.out.println(ocupacion);
      String ocupacion2 = viaje2.obtenerOcupacion();
      System.out.println(ocupacion2);
      //viaje1.obtenerOcupacion();
      //viaje2.obtenerOcupacion();

      viaje1.crearHojaViaje("hoja_viaje1.txt");
      viaje2.crearHojaViaje("hoja_viaje2.txt");

    } catch (Exception e) {
      System.out.println(e);
      e.printStackTrace();
    }
  }
}
