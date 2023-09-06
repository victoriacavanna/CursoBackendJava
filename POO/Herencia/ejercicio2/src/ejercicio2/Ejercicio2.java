package ejercicio2;

import ejercicio2.entidades.Lavadora;
import ejercicio2.entidades.Televisor;

public class Ejercicio2 {

    public static void main(String[] args) {
//
        Lavadora lavadora1 = new Lavadora();
        Televisor televisor1 = new Televisor();

        System.out.println("Datos lavadora 1: ");
        lavadora1.crearLavadora();
        lavadora1.mostrarProducto();
        System.out.println("Precio final lavadora: " + lavadora1.precioFinal());

        System.out.println("Ingresar datos del televisor: ");
        televisor1.crearTelevisor();
        televisor1.mostrarProducto();
        System.out.println("Precio final del televisor: " + televisor1.precioFinal());

    }

}
