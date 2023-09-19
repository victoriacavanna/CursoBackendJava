package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresar números: ");

        try {
            for (int i = 0; i < 8; i++) {
                System.out.println("Ingresar posición [" + i + "]");
                int num = read.nextInt();
                numeros[i] = num;
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Fuera de index");
        } finally {
            System.out.println("Fin de ejecución");
        }

    }

}
