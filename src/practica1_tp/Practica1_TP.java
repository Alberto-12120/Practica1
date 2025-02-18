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
            // Prototipo 1  
            Viaje viaje1 = new Viaje("viajes.txt", 0);
            Viaje viajeCCat = new Viaje("v1", "viajes.txt");
            Viaje viaje2 = new Viaje("viajes.txt");
          
            System.out.println(viaje1);
            System.out.println(viaje1);

    
            //Prototipo 2
            viaje1.asignarAsiento(15, new Viajero(...));
            viaje1.asignarAsiento(45, new Viajero(...));  
          
            System.out.println(viaje1.obtenerOcupacion());
          
            //Prototipo 3
            viaje1.generarHoja(...);
            ...      
          } catch(Exception e) {
            System.out.println(e);
          }
        }
    
       
    }

