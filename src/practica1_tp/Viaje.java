/*
 *  Viaje.java
 *  Alberto Álvarez y Samuel Rodriguez (02/2025)
 * 
 */

package practica1_tp;

import java.time.LocalDate;
import java.time.LocalTime;

public class Viaje {
    private String codigo;
    private String origen;
    private String destino;
    private LocalDate dia;
    private LocalDate mes;
    private LocalDate año;
    private LocalTime hora;
    private LocalTime minutos;
    private Bus bus;

    /*
     * Constructor que lee la información de una línea específica de un archivo de texto
     * 
     * Construye un viaje
     */
 
    public Viaje(String codigo, String origen, String destino, LocalDate dia, LocalDate mes, 
                LocalDate años, LocalTime hora, LocalTime minutos, Bus bus) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.dia = dia;
        this.mes = mes;
        this.año = años;
        this.hora = hora;
        this.minutos = minutos;
        this.bus = bus;
    } 

    public void obtenerOcupacion(){
        System.out.println(codigo + " " + origen + "-" + destino + " " + dia + "/" + mes + "/" + año + " " + hora + ":" + minutos);
        bus.obtenerOcupacion();
    }

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


    public void asignarAsiento(Viajero viajero, int numero) {
        bus.asignarAsiento(viajero, numero);
    }
}
