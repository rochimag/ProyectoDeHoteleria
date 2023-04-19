package modelo;

public abstract class Hospederia extends MedioDeAlojamiento{

    private boolean esFumador;

    public Hospederia() {
    }

    public Hospederia(DatosCliente datoCliente, int cantidadDeNoches, int valorBaseNoche, String tipoTemporada, boolean esFumador) {
        super(datoCliente, cantidadDeNoches, valorBaseNoche, tipoTemporada);
        this.esFumador = esFumador;
    }

    public boolean isEsFumador() {
        return esFumador;
    }

    public void setEsFumador(boolean esFumador) {
        this.esFumador = esFumador;
    }

    /*adicional: devolverá el valor adicional, que corresponde al 30% del subtotal si es Fumador y con desayuno.*/
    public abstract int valorAdicional();

    /*valorACancelar: devolverá el valor a cancelar, el cual al subtotal
    se le debe descontar el bono y sumar el adicional,
    donde corresponda*/
    public abstract int valorACancelar();

    @Override
    public int incrementaValorBase() {
        return 0;
    }
}