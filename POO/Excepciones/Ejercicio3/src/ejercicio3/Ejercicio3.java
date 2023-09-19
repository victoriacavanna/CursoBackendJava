package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        DivisionNumero divisionNum = new DivisionNumero();

        System.out.println("Ingresar un dividendo: ");
        String a = read.next();
        System.out.println("Ingresar un divisor: ");
        String b = read.next();
        double resultado = 0;
        try {
            int numA = Integer.valueOf(a);
            int numB = Integer.valueOf(b);
            resultado = divisionNum.division(numA, numB);
            
        } catch (ArithmeticException e) {
            System.out.println("No es posible la división en: " + b);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());   
        } finally {
            System.out.println("Resultado: " + resultado);
        }
    }

}
