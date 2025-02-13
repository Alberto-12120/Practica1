package practica1_tp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fichero {
    public void leerBus(){
        try{
            File archivoBus = new File("Bus.txt");
            Scanner scannerBus = new Scanner(archivoBus);
        }
        catch (FileNotFoundException e){
            System.out.println("Ha habido un error en la lectura del archivo");
        }
    }
}
