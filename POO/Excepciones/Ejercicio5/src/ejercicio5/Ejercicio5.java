package ejercicio5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        int numIntento;
        int intentos;
        int numAleatorio;

        numAleatorio = random.nextInt(500) + 1;
        intentos = 0;
        try {
            do {
                System.out.println("Ingresar un número: ");
                numIntento = read.nextInt();
                intentos += 1;
                if (numIntento == numAleatorio) {
                    break;
                } else if (numIntento > numAleatorio) {
                    System.out.println("El número a adivinar es menor");
                } else {
                    System.out.println("El número a adivinar es mayor");
                }

            } while (numIntento != numAleatorio);
            System.out.println("Adivinaste! El número era: " + numAleatorio);

        } catch (InputMismatchException e) {
            intentos += 1;
            System.out.println("Error. Tipo de dato ingresado inválido");
        } finally {
            System.out.println("-----------------------------------------");
            System.out.println("Intentos: " + intentos);
        }
    }

}
