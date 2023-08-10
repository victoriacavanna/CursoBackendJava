package ejercicio1;

import ejercicio1.entidades.Perro;
import ejercicio1.entidades.Persona;

public class Ejercicio1 {

    public static void main(String[] args) {
        Perro perro1 = new Perro("Nala", "Beagle", 2, "mediana");
        Perro perro2 = new Perro("Arya", "Beagle", 6, "mediana");

        Persona persona1 = new Persona("Luis", "Cavanna", 53, "20433953");
        Persona persona2 = new Persona("Victoria", "Cavanna", 18, "45443090");

        persona1.setPerro(perro1);
        persona2.setPerro(perro2);

        System.out.println("---- PERSONA 1: ----");
        System.out.println(persona1.toString());
        System.out.println("---- PERSONA 2: ----");
        System.out.println(persona2.toString());

    }

}
