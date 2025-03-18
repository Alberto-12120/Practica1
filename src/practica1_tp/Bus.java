/**
 *  Bus.java
 *  Alberto Álvarez (02/2025)
 * 
 */

package practica1_tp;

import java.io.FileInputStream;
import java.util.Scanner;

public class Bus {
    private String codigo;
    private int filas;
    private int columnas;
    private Asiento[][] asientos;

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
            scannerBus.close();
        } catch (Exception e) {
        }
    }

    public void asignarAsiento(Viajero viajero, int numero) {
        for (int i = 0; i < this.filas; i++) {
            if (i != 2) {
                for (int j = 0; j < this.columnas; j++) {
                    if (j != 9 && (i != 2 || i != 3 || i != 4)) {
                        if (this.asientos[i][j].obtenerNumero() == numero) {
                            this.asientos[i][j].asignarAsiento(viajero);
                        }
                    }
                }
            }
        }
    }

    public void obtenerOcupacion() {
        for (int i = this.filas - 1; i >= 0; i--) {
            for (int j = 0; j < this.columnas; j++) {
                if (this.asientos[i][j] != null && !this.asientos[i][j].estaVacio()) {
                    System.out.print("(" + String.format("%02d", this.asientos[i][j].obtenerNumero()) + ") ");
                } else if (this.asientos[i][j] != null && this.asientos[i][j].estaVacio()) {
                    System.out.print(" " + String.format("%02d", this.asientos[i][j].obtenerNumero()) + "  ");
                } else {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
        System.out.println("(XX) - Asiento XX ocupado");
    }

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
}
