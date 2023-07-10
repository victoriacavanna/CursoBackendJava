

package ejercicio6;
import java.util.Scanner;



public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        int num = read.nextInt();
        
        if (esPar(num)){
            System.out.println(num + " es un número par!");
        } else {
            System.out.println(num + " es un número impar!");
        }
    }
    
    public static boolean esPar(int numero){
        boolean resultado = (numero % 2 == 0);
        return resultado;
    }
}
