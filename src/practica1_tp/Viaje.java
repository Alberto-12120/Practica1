/*
 *  Viaje.java
 *  Alberto Álvarez (02/2025)
 * 
 */

package practica1_tp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Viaje {
    private String codigo;
    private String origen;
    private String destino;
    private LocalDate fecha;
    private LocalTime hora;
    private Bus bus;
    private String enunciadoViaje = "Viaje: ";
    private String separador = "-";
    private String enunciadoFecha = " Fecha: ";
    private String enunciadoHora = " Hora: ";
    private String enunciadoViajeOcupacion = "Para el viaje ";

    public Viaje(Scanner scanner, Bus bus) {
        try {
            if (scanner == null) {
                throw new IllegalArgumentException("El scanner no puede ser nulo");
            }

            this.codigo = scanner.next();
            this.origen = scanner.next();
            this.destino = scanner.next();

            String fechaStr = scanner.next();
            String horaStr = scanner.next();

            this.fecha = LocalDate.parse(fechaStr);
            this.hora = LocalTime.parse(horaStr);

            if (bus == null) {
                throw new IllegalArgumentException("El bus no puede ser nulo");
            }
            this.bus = bus;

        } catch (NoSuchElementException e) {
            System.err.println("Datos insuficientes para crear el viaje: "
                    + e.getMessage());
        } catch (DateTimeParseException e) {
            System.err.println("Error en el formato de fecha u hora: "
                    + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Argumento inválido: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado al crear el viaje: "
                    + e.getMessage());
        } finally {
        }
    }

    public String obtenerOcupacion() {
        StringBuilder cadena = new StringBuilder();
        cadena.append(enunciadoViajeOcupacion).append(origen).append(separador).append(destino).append("\n");
        cadena.append(bus.obtenerOcupacion()); // Llama al método obtenerOcupacion del Bus
        return cadena.toString();
    }

    /* 
    public void obtenerOcupacion() {
        System.out.println("Para el viaje " + origen + "-" + destino);
        toString();
        bus.obtenerOcupacion();
    }
    */
    public void crearHojaViaje(String nombreHojaViaje) throws Exception {
        PrintWriter fichero = new PrintWriter
        (new BufferedWriter(new FileWriter(nombreHojaViaje)));
        fichero.println(bus.toString());
        fichero.close();
    }

    public void asignarAsiento(Viajero viajero, int numero) {
        bus.asignarAsiento(viajero, numero);
    }

    @Override
    public String toString() {
        return enunciadoViaje + origen + separador + destino +
                enunciadoFecha + fecha + enunciadoHora + hora;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Viaje viaje = (Viaje) obj;
        return codigo.equals(viaje.codigo);
    }

    @Override
    public int hashCode() {
        return codigo.hashCode();
    }
}
