package ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        int doble;
        int triple;
        double raizCuadrada;

        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        int num = read.nextInt();
        
        doble = num * 2;
        triple = num * 3;
        raizCuadrada = Math.sqrt(num);
        
        System.out.println("Doble de " + num + " es: " + doble);
        System.out.println("Triple de " + num + " es: " + triple);
        System.out.println("Raíz de " + num + " es:  " + raizCuadrada);
        
    }

}