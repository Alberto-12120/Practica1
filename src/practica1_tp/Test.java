package practica1_tp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    // Prototipo 1 - Ficheros
    public void escanearBus (){
        try{
            File archivoBus = new File("Bus.txt");
            Scanner scannerBus = new Scanner (archivoBus);
            System.out.println(scannerBus);
        }
        catch (FileNotFoundException e){
            System.out.println("Archivo Bus.txt no encontrado");
        }
    }
    
    public void escanearViaje (){
        try{
            File archivoViaje = new File("Viaje.txt");
            Scanner scannerViaje = new Scanner (archivoViaje);
            System.out.println(scannerViaje);
        }
        catch (FileNotFoundException e){
            System.out.println("Archivo Viaje.txt no encontrado");
        }
    }
    
    // Prototipo 2 - Asignar
    
}
