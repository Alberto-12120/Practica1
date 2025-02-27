/*
 *  Viaje.java
 *  Alberto Álvarez y Samuel Rodriguez (02/2025)
 * 
 */

package practica1_tp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.io.PrintWriter;
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
        toString();
        bus.obtenerOcupacion();
    }


    /*
    //Genera la hoja de viaje con los asientos asignados de cada pasajero
    public void generarHojaViaje() {
        String[] listadoViajeros = bus.obtenerListadoViajeros();
        try (PrintWriter writer = new PrintWriter("hoja_viaje.txt")) {
            writer.println("Listado de Viajeros y Asientos Asignados:");
            for (String linea : listadoViajeros) {
                writer.println(linea);
            }
            System.out.println("Hoja de viaje generada correctamente.");
        } catch (FileNotFoundException e) {
            System.out.println("Error al generar la hoja de viaje: " + e.getMessage());
        }
    }
    */

    public void asignarAsiento(Viajero viajero, int numero) {
        System.out.println("Para el viaje " + origen + "-" + destino);
        bus.asignarAsiento(viajero, numero);
    }
}
