package ejercicio5b;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5B {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        int numIntento;
        int intentos;
        int numAleatorio;

        boolean adivinado = false;
        numAleatorio = random.nextInt(10) + 1;
        intentos = 0;

        while (!adivinado) {
            try {
                System.out.println("Ingresar un número: ");
                numIntento = read.nextInt();
                intentos++;

                if (numIntento == numAleatorio) {
                    adivinado = true;
                } else if (numIntento > numAleatorio) {
                    System.out.println("El número a adivinar es menor");
                } else {
                    System.out.println("El número a adivinar es mayor");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                read.nextLine();

            }
        }
        System.out.println("Adivinaste! El número era: " + numAleatorio);
        System.out.println("Intentos: " + intentos);

    }
}
