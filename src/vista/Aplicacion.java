package vista;

import controlador.EmpresaTurismo;
import modelo.MedioDeAlojamiento;
import modelo.Cabagna;
import modelo.Hotel;
import modelo.Carpa;
import modelo.Hospederia;
import modelo.DatosCliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        EmpresaTurismo empresa = new EmpresaTurismo(new ArrayList<>());

        Carpa carpa = new Carpa (new DatosCliente("Carlos Mendoza",40775046),4,10000,"Baja",5);


        Hotel hotel = new Hotel (new DatosCliente("sofia ",40775046),5,16000,"Media",true,true,8);


        Cabagna cabagna = new Cabagna(new DatosCliente("Florencia",233323),8,12000,"Alta",true,9,true);

        empresa.ingresarMedioDeAlojamientoCarpa(carpa);
        empresa.ingresarMedioDeAlojamientoHotel(hotel);
        empresa.ingresarMedioDeAlojamientoCabagna(cabagna);

        int opcion;
        do{
            opcion = menu();
            switch(opcion){
                case 1:
                    System.out.println("Ingreso Medio de Alojamiento");
                    break;
                case 2:
                    if(empresa.getEmpresa().size()==0){
                        System.out.println("No hay MEDIOS DE ALOJAMIENTO");
                    }else{
                        System.out.println(empresa.mediosDeAlojamiento());
                    }
                    break;
                case 3:
                    System.out.println("Datos de un Cliente X");
                    break;
                case 4:
                    System.out.println("Total Adicional");
                    break;
                case 5:
                    System.out.println("Total Bono Descuento");
                    break;
                case 6:
                    System.out.println("Cantidad medios de alojamiento X");
                    break;
                case 7:
                    System.out.println("Valor a cancelar por un cliente X ");
                    break;
                case 8:
                    System.out.println("Aplicar incremento del valor base");
                    break;
            }

        }while(opcion !=9); //repetir
    }

    public static int menu(){
        System.out.println("**********EMPRESA TURISMO*********");
        System.out.println("1.\tIngresar Medio de Alojamiento ");
        System.out.println("2.\tMostrar Medios de Alojamiento");
        System.out.println("3.\tDatos de un cliente X");
        System.out.println("4.\tTotal Adicional");
        System.out.println("5.\tTotal Bono Descuento");
        System.out.println("6.\tCantidad medios de Alojamiento X");
        System.out.println("7.\tValor a Cancelar por un Cliente x");
        System.out.println("8.\tAplicar incremento del valor base ");
        System.out.println("Favor ingrese opción para continuar...");

        return Leer.datoInt();
    }

    public static String pedirCodigo(){
        System.out.println("Favor ingrese rutId del Cliente (Ej: 12323)");
        return Leer.dato();
    }

}