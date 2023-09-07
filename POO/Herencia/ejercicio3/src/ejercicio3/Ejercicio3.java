package ejercicio3;

import ejercicio3.entidades.Electrodomestico;
import ejercicio3.entidades.Lavadora;
import ejercicio3.entidades.Televisor;
import java.util.ArrayList;

public class Ejercicio3 {

    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();

        Lavadora lavadora1 = new Lavadora(40, 1000, "blanco", 'A', 50);
        electrodomesticos.add(lavadora1);
        Televisor televisor1 = new Televisor(50, false, 1000, "negro", 'B', 30);
        electrodomesticos.add(televisor1);
        Lavadora lavadora2 = new Lavadora(20, 1000, "blanco", 'A', 70);
        electrodomesticos.add(lavadora2);
        Televisor televisor2 = new Televisor(30, false, 1000, "negro", 'A', 40);
        electrodomesticos.add(televisor2);

        lavadora1.precioFinal();

        double sumaTotal = 0;
        double sumaLavadora = 0;
        double sumaTelevisor = 0;

        for (Electrodomestico aux : electrodomesticos) {
            aux.precioFinal();
            sumaTotal += aux.getPrecio();
            if (aux instanceof Lavadora) {
                Lavadora object = (Lavadora) aux;
                sumaLavadora += object.getPrecio();
            }
            if (aux instanceof Televisor) {
                Televisor object = (Televisor) aux;
                sumaTelevisor += object.getPrecio();
            }
        }
        System.out.println("Resumen de la compra:");
        System.out.println("1- Lavadora: $" + lavadora1.getPrecio());
        System.out.println("2- Lavadora: $" + lavadora2.getPrecio());
        System.out.println("1- Televisor: $" + televisor1.getPrecio());
        System.out.println("2- Televisor: $" + televisor2.getPrecio());
        System.out.println("-----------------------");
        System.out.println("Subtotal de Lavadoras: $" + sumaLavadora);
        System.out.println("Subtotal de Televisores: $" + sumaTelevisor);
        System.out.println("-----------------------");
        System.out.println("Total: $" + sumaTotal);

    }

}
