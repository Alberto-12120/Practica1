package practica1_tp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bus {
    private int filas;
    private int columnas;
    private Asiento asiento[][];
    
    // Contstruye el bus de un fichero
    public void obtenerOcupacion(){
        try{
            File archivoBus = new File("Bus.txt");
            Scanner scannerBus = new Scanner(archivoBus);
            
            filas = scannerBus.nextInt();
            columnas = scannerBus.nextInt();
            
            while (scannerBus.hasNext()){
                String codigoAsiento = scannerBus.next();
                int filaAsiento = scannerBus.nextInt();
                int columnaAsiento = scannerBus.nextInt();
//                asiento[filaAsiento][columnaAsiento] = new Asiento (codigoAsiento);
                System.out.println("Asiento: " + codigoAsiento + " " + filaAsiento + " " + columnaAsiento);
            }
        }        
        catch (FileNotFoundException e) {
            System.out.println("Archivo Bus.txt no encontrado.");
        }
    }
}
