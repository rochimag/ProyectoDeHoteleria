package modelo;

public abstract class MedioDeAlojamiento {

    private DatosCliente datoCliente;
    private int cantidadDeNoches;
    private int valorBaseNoche;
    private String tipoTemporada;

    public MedioDeAlojamiento(DatosCliente datoCliente, int cantidadDeNoches, int valorBaseNoche, String tipoTemporada) {
        this.datoCliente = datoCliente;
        this.cantidadDeNoches = cantidadDeNoches;
        this.valorBaseNoche = valorBaseNoche;
        this.tipoTemporada = tipoTemporada;
    }

    public MedioDeAlojamiento() {
    }

    public DatosCliente getDatoCliente() {
        return datoCliente;
    }

    public void setDatoCliente(DatosCliente datoCliente) {
        this.datoCliente = datoCliente;
    }

    public int getCantidadDeNoches() {
        return cantidadDeNoches;
    }

    public void setCantidadDeNoches(int cantidadDeNoches) {
        this.cantidadDeNoches = cantidadDeNoches;
    }

    public int getValorBaseNoche() {
        return valorBaseNoche;
    }

    public void setValorBaseNoche(int valorBaseNoche) {
        this.valorBaseNoche = valorBaseNoche;
    }

    public String getTipoTemporada() {
        return tipoTemporada;
    }

    public void setTipoTemporada(String tipoTemporada) {
        this.tipoTemporada = tipoTemporada;
    }

    /*subtotal: devolverá el subtotal a cancelar el cual será cantidad de noches por el valorBaseNoche*/
    public int subTotal(){
        int subTotalACancelar=getCantidadDeNoches()*getValorBaseNoche();
        return subTotalACancelar;
    }


    /*bonoDescuento: devolverá el valor a descontar sabiendo que es un 25% del subTotal si el tipo de temporada es baja o es de un 12.5% si el tipo Temporada es media.*/
    public int bonoDescuento(){
        int valorADescontar = 0;
        if (this.getTipoTemporada().equalsIgnoreCase("Baja")){
            valorADescontar = this.subTotal() * 25 / 100;
            return valorADescontar;
        } else if (this.getTipoTemporada().equalsIgnoreCase("Media")){
            valorADescontar = (int) (this.subTotal() * 12.5 / 100);
            return valorADescontar;
        } else {
            System.out.println("no se puede realizar descuento porque es temporada alta");
        }
        return valorADescontar;
    }

    /*incrementaValorBase: aumenta el valor base en un 18%
    si la capacidad de la cabaña es superior a 5.*/
    public abstract int incrementaValorBase();
}

