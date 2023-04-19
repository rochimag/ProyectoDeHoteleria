package modelo;

public class Cabagna extends Hospederia{
    private int capacidad;


    private boolean chimenea;

    public Cabagna(DatosCliente datoCliente, int cantidadDeNoches, int valorBaseNoche, String tipoTemporada, boolean esFumador, int capacidad, boolean chimenea) {
        super(datoCliente, cantidadDeNoches, valorBaseNoche, tipoTemporada, esFumador);
        this.capacidad = capacidad;
        this.chimenea = chimenea;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }



    public boolean isChimenea() {
        return chimenea;
    }

    public void setChimenea(boolean chimenea) {
        this.chimenea = chimenea;
    }

    @Override
    public int valorACancelar() {
        return 0;
    }

    @Override
    public int valorAdicional() {
        return 0;
    }

}