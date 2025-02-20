/**
 *  Bus.java
 *  Alberto Álvarez y Samuel Rodriguez (02/2025)
 * 
 */

package practica1_tp;

public class Bus {
    private int filas;
    private int columnas;
    private Asiento asiento;

    /*
    //Construye el bus
    public Bus(int filas, int columnas){
        this.filas = filas;
        this.columnas = columnas;
        asiento = new Asiento[filas][columnas];
    }
    */

    /* 
    // Contstruye el bus de un fichero
    public void obtenerAsientos(){
        try{
            File archivoBus = new File("Bus.txt");
            Scanner scannerBus = new Scanner(archivoBus);
            
            filas = scannerBus.nextInt();
            columnas = scannerBus.nextInt();

            Asiento[][] asiento = new Asiento [filas][columnas];
            
            while (scannerBus.hasNext()){
                String codigoAsiento = scannerBus.next();
                int filaAsiento = scannerBus.nextInt();
                int columnaAsiento = scannerBus.nextInt();
                asiento[filaAsiento][columnaAsiento] = new Asiento(codigoAsiento);
            }
            scannerBus.close();
        }        
        catch (FileNotFoundException e) {
            System.out.println("Archivo Bus.txt no encontrado.");
        }
    }
    */

    public void asignarAsiento(Viajero viajero, String numero){
        asiento.asignarAsiento(viajero, numero);
    }

    public void obtenerOcupacion(){
        
    }

    //genera el listado de los viajeros en el bus
    public String[] obtenerListadoViajeros() {
        String[] listado = new String[contador];
        for (int i = 0; i < contador; i++) {
            listado[i] = "Viajero: " + viajeros[i].getNombre() + ", Asiento: " + asientos[i];
        }
        return listado;
    }
}
