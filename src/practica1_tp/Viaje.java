/*
 *  Viaje.java
 *  Alberto Álvarez y Samuel Rodriguez (02/2025)
 * 
 */

package practica1_tp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
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
 
    public Viaje(Scanner scanner, Bus bus) {
        this.codigo = scanner.next();
        this.origen = scanner.next();
        this.destino = scanner.next();
        this.fecha = LocalDate.parse(scanner.next());
        this.hora = LocalTime.parse(scanner.next());
        this.bus = bus;
    }

    public void obtenerOcupacion() {
        bus.obtenerOcupacion();
    }


    /**
   *  crea la hoja de viaje
   * 
   */   
  public void crearHojaViaje(String nombreFichero) throws Exception {
    PrintWriter fichero = 
      new PrintWriter(new BufferedWriter(new FileWriter(nombreFichero)));    
    
    fichero.println(bus.asiento.numero());
    fichero.println(bus.asiento.viajero());
    
    fichero.close();
  }


    public void asignarAsiento(Viajero viajero, int numero) {
        System.out.println("Para el viaje " + origen + "-" + destino);
        bus.asignarAsiento(viajero, numero);
    }
}
