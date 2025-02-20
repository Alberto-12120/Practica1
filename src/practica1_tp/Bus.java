/**
 *  Bus.java
 *  Alberto Álvarez y Samuel Rodriguez (02/2025)
 * 
 */

package practica1_tp;

public class Bus {
    private String codigo;
    private int filas;
    private int columnas;
    private Asiento[] asiento;

    
    //Construye el bus
    public Bus(String codigo, int filas, int columnas, Asiento[] asiento){
        this.codigo = codigo;
        this.filas = filas;
        this.columnas = columnas;
        this.asiento = asiento;
    }
    

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
        int index = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (asientos[i][j] != null && asientos[i][j].getViajero() != null) {
                    listado[index] = "Viajero: " + asientos[i][j].getViajero().getNombre() + ", Asiento: " + asientos[i][j].getNumero();
                    index++;
                }
            }
        }
        return listado;
    }
}
