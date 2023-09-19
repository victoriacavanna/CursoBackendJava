package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        try {
            System.out.println("Ingresar un número entero: ");
            int entero = read.nextInt();

            System.out.println("Ingresar una cadena de texto para convertir a un número entero: ");
            int resultadoConversion = Integer.parseInt(read.next());

            System.out.println("Ingresar un divisor");
            int divisor = read.nextInt();

            if (divisor == 0) {
                throw new ArithmeticException("No es posible la división en 0");
            }
            int resultado = entero / divisor;

            System.out.println("El resultado de la división es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error. Por favor, ingrese un número entero.");
        } catch (NumberFormatException e) {
            System.out.println("No es posible convertir la cadena de texto en entero.");
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.getMessage());
        } finally {
            read.close();
        }

    }

}
