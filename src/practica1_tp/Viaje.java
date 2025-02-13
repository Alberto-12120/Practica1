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
    private LocalDate fecha;
    private LocalTime hora;
    private Bus bus;

      
    public void obtenerOcupacion(){
        try{
            File archivoViaje = new File("Viaje.txt");
            Scanner scannerViaje = new Scanner(archivoViaje);
            
            while (scannerViaje.hasNextLine()){
                codigo = scannerViaje.next();
                origen = scannerViaje.next();
                destino  = scannerViaje.next();
//                fecha = scannerViaje.next
                bus = new Bus(); 
            }
            System.out.println(origen + "-" + destino);
        }        
        catch (FileNotFoundException e) {
            System.out.println("Archivo Viaje.txt no encontrado.");
        }
        
    }
    
    public void generarHojaViaje(){
        
    }
    
    public void asignarAsientos(){
        
    }
}
