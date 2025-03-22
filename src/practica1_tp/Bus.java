/**
 *  Bus.java
 *  Alberto Álvarez (02/2025)
 * 
 */

package practica1_tp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bus {
    private String codigo;
    private int filas;
    private int columnas;
    private Asiento[][] asientos;
    private int filaPasillo = 2;
    private int columnaPuertaAtras = 9;
    private int filaPuertaAtras = 0;
    private int filaPuertaAtras2 = 1;
    private String formatoNumeros = "%02d";
    private String asientosOcupados = "(XX) - Asiento XX ocupado";
    Scanner scannerBus = null;

    public Bus(String archivo) {
        try {
            Scanner scannerBus = new Scanner(new FileInputStream(archivo));
            this.filas = scannerBus.nextInt();
            this.columnas = scannerBus.nextInt();
            this.asientos = new Asiento[filas][columnas];
            while (scannerBus.hasNextLine()) {
                int numero = scannerBus.nextInt();
                int filasAux = scannerBus.nextInt();
                int columnasAux = scannerBus.nextInt();
                this.asientos[filasAux][columnasAux] = new Asiento(numero);
            }
        } catch (FileNotFoundException e) {
            System.err.println("El archivo " + archivo + " no fue encontrado: "
                    + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Error en el formato de los datos: "
                    + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
        } finally {
            if (scannerBus != null) {
                scannerBus.close();
            }
        }
    }

    public void asignarAsiento(Viajero viajero, int numero) {
        for (int i = 0; i < this.filas; i++) {
            if (i != filaPasillo) {
                for (int j = 0; j < this.columnas; j++) {
                    if (j != columnaPuertaAtras && (i != filaPuertaAtras ||
                            i != filaPuertaAtras2)) {
                        if (this.asientos[i][j].obtenerNumero() == numero) {
                            this.asientos[i][j].asignarAsiento(viajero);
                        }
                    }
                }
            }
        }
    }
    public String obtenerOcupacion() {
        StringBuilder cadena = new StringBuilder();
        for (int i = this.filas - 1; i >= 0; i--) {
            for (int j = 0; j < this.columnas; j++) {
                if (this.asientos[i][j] != null && !this.asientos[i][j].estaVacio()) {
                    cadena.append("(")
                          .append(String.format(formatoNumeros, this.asientos[i][j].obtenerNumero()))
                          .append(") ");
                } else if (this.asientos[i][j] != null && this.asientos[i][j].estaVacio()) {
                    cadena.append(" ")
                          .append(String.format(formatoNumeros, this.asientos[i][j].obtenerNumero()))
                          .append("  ");
                } else {
                    cadena.append("     ");
                }
            }
            cadena.append("\n");
        }
        cadena.append(asientosOcupados);
        return cadena.toString();
    }
    /* 
    public void obtenerOcupacion() {
        for (int i = this.filas - 1; i >= 0; i--) {
            for (int j = 0; j < this.columnas; j++) {
                if (this.asientos[i][j] != null && !this.asientos[i][j].estaVacio()) {
                    System.out.print("(" + String.format(formatoNumeros,
                            this.asientos[i][j].obtenerNumero()) + ") ");
                } else if (this.asientos[i][j] != null &&
                        this.asientos[i][j].estaVacio()) {
                    System.out.print(" " + String.format(formatoNumeros,
                            this.asientos[i][j].obtenerNumero()) + "  ");
                } else {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
        System.out.println("(XX) - Asiento XX ocupado");
    }
    */

    @Override
    public String toString() {
        String cadena = "";
        for (int i = 0; i < this.asientos.length; i++) {
            for (int j = 0; j < this.asientos[i].length; j++) {
                if (this.asientos[i][j] != null && !this.asientos[i][j].estaVacio()) {
                    cadena += this.asientos[i][j].toString();
                }
            }
        }
        return cadena;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Bus bus = (Bus) obj;
        return codigo.equals(bus.codigo); // Compara por código del bus
    }

    @Override
    public int hashCode() {
        return codigo.hashCode(); // Usa el hash del código del bus
    }
}
