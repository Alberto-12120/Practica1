/*
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
        toString();
        bus.obtenerOcupacion();
    }

    public void generarHojaViaje() {

    }

    public void asignarAsiento(Viajero viajero, String numero) {
        bus.asignarAsiento(viajero, numero);
    }
}
