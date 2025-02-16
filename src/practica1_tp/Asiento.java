package practica1_tp;

public class Asiento {
    private Boolean fueraServicio;
    private Viajero viajero;
    private String numero;

    public Asiento(String numero) {
        this.numero = numero;
    }

    //Obtiene de la clase Viajero el viajero que ocupa el asiento
    Viajero obtenViajero () {
        if (!fueraServicio){
            return viajero;
        }
        return null;
    }

    //Devuelve si el asiento esta fuera de servicio
    boolean estarFueraServicio(){
        return fueraServicio;
    }

    void asiganarAsieto (Viajero viajero){
        this.viajero = viajero; //Como el asieto ya tiene un viajero asignado, el asiento ya no esta disponible
    }
}
