package ejercicio2.servicios;

import ejercicio2.entidades.Electrodomestico;
import ejercicio2.entidades.Lavadora;
import ejercicio2.entidades.Televisor;
import java.util.Scanner;

public class ElectrodomesticoService {

    public Electrodomestico crearElectrodomestico() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico electrodomestico = new Electrodomestico();
        System.out.println("Color: ");
        String color = read.next();

        System.out.println("Consumo energético: ");
        String linea = read.next();
        char consumo = linea.charAt(0);

        System.out.println("Peso en kg: ");
        double peso = read.nextDouble();

        electrodomestico.setPrecio(1000);
        electrodomestico.setColor(electrodomestico.comprobarColor(color));
        electrodomestico.setConsumo(electrodomestico.comprobarConsumoEnergetico(consumo));
        electrodomestico.setPeso(peso);

        return electrodomestico;

    }

    public Lavadora crearLavadora() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico electrodomestico = crearElectrodomestico();

        System.out.println("Carga del lavarropas (en kg): ");
        int carga = read.nextInt();
        Lavadora lavadora = new Lavadora(carga, electrodomestico.getPrecio(), electrodomestico.getColor(), electrodomestico.getConsumo(), electrodomestico.getPeso());
        lavadora.setPrecio(lavadora.precioFinal());
        return lavadora;
    }

    public Televisor crearTelevisor() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico electrodomestico = crearElectrodomestico();
        System.out.println("Resolución en pulgadas: ");
        double resolucion = read.nextDouble();

        System.out.println("Sintonizador (s/n): ");
        String linea = read.next().toLowerCase();
        char sintonizadorLetra = linea.charAt(0);
        boolean sintonizador = (sintonizadorLetra == 's');
        Televisor televisor = new Televisor(resolucion, sintonizador, electrodomestico.getPrecio(), electrodomestico.getColor(), electrodomestico.getConsumo(), electrodomestico.getPeso());
        televisor.setPrecio(televisor.precioFinal());
        return televisor;
    }
    
    
}
