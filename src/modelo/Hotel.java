package modelo;

public class Hotel extends Hospederia {
    private boolean conDesayuno;
    private int capacidad;

    public Hotel(DatosCliente datoCliente, int cantidadDeNoches, int valorBaseNoche, String tipoTemporada, boolean esFumador, boolean conDesayuno, int capacidad) {
        super(datoCliente, cantidadDeNoches, valorBaseNoche, tipoTemporada, esFumador);
        this.conDesayuno = conDesayuno;
        this.capacidad = capacidad;
    }



    public boolean isConDesayuno() {
        return conDesayuno;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setConDesayuno(boolean conDesayuno) {
        this.conDesayuno = conDesayuno;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public int valorAdicional() {
        int valorAdicional=0;
        if(this.isConDesayuno() && this.isEsFumador()){
            valorAdicional=this.subTotal() * 30/100;
            return valorAdicional;
        }
        return valorAdicional;
    }

    /*valorACancelar: devolverá el valor a cancelar, el cual al subtotal
    se le debe descontar el bono y sumar el adicional,
    donde corresponda*/
    @Override
    public int valorACancelar() {
        int valorACancelar = 0;
        valorACancelar=subTotal()-bonoDescuento()+valorAdicional();
        return valorACancelar;
    }

}