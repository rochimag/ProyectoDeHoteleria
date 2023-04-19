package controlador;

import modelo.MedioDeAlojamiento;
import modelo.Hotel;
import modelo.Carpa;
import modelo.Hospederia;
import modelo.DatosCliente;
import modelo.Cabagna;


import java.util.ArrayList;

public class EmpresaTurismo {
    //atributos
    private ArrayList<MedioDeAlojamiento> empresa;//{medioAlojamiento1,medioAlojamiento2}

    //metodos accesadores y modificadores
    public ArrayList<MedioDeAlojamiento> getEmpresa() {
        return empresa;
    }

    public void setEmpresa(ArrayList<MedioDeAlojamiento> empresa) {
        this.empresa = empresa;
    }

    public EmpresaTurismo(ArrayList<MedioDeAlojamiento> empresa) {
        this.empresa = empresa;
    }

    //Logica
    public int buscarCliente(int rutCliente ){
        for(int i=0; i<empresa.size();i++){
//condicion para encontrar cliente
            if(empresa.get(i).getDatoCliente().equals(rutCliente)){
                return i;
            }
        }
        return -1;
    }

    //ingresar medios de Alojamiento
    public void ingresarMedioDeAlojamientoCarpa(Carpa carpa){
        if(buscarCliente(carpa.getDatoCliente().getRutCliente())==-1){
            empresa.add(carpa);
        }
    }

    public void ingresarMedioDeAlojamientoHotel(Hotel hotel){
        if(buscarCliente(hotel.getDatoCliente().getRutCliente())==-1){
            empresa.add(hotel);
        }
    }

    public void ingresarMedioDeAlojamientoCabagna(Cabagna cabagna){
        if(buscarCliente(cabagna.getDatoCliente().getRutCliente())==-1){
            empresa.add(cabagna);
        }
    }


    /*MOSTRAR MEDIOS DE ALOJAMIENTO*/
    public String mediosDeAlojamiento(){
        String mensaje="";
        MedioDeAlojamiento medioDeAlojamiento=null;
        int contador =0;
        for (int i = 0; i < empresa.size(); i++) { //iterar en la colección
            if(empresa.get(i) instanceof MedioDeAlojamiento){
                medioDeAlojamiento=(MedioDeAlojamiento) empresa.get(i);
                mensaje = mensaje + "\n los medios de alojamiento son: "+ medioDeAlojamiento.getDatoCliente();
                contador++;
            }

        }
        if (contador == 0) {
            mensaje = "no hay calzados de mujer :/";
        }
        return mensaje;
    }


}
