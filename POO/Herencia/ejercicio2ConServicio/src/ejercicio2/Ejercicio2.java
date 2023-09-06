package ejercicio2;

import ejercicio2.entidades.Lavadora;
import ejercicio2.entidades.Televisor;
import ejercicio2.servicios.ElectrodomesticoService;

public class Ejercicio2 {

    public static void main(String[] args) {
//
        ElectrodomesticoService se = new ElectrodomesticoService();
        System.out.println("---LAVADORA----");
        Lavadora lavadora = se.crearLavadora();
        lavadora.mostrarProducto();

        System.out.println("---TELEVISOR----");
        Televisor televisor = se.crearTelevisor();
        televisor.mostrarProducto();

    }

}
