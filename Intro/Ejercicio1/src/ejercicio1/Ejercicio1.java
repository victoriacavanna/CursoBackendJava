
package ejercicio1; 
import java.util.Scanner;


public class Ejercicio1 {
    
    public static void main(String[] args) {
        int resultadoSuma;
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        int num1 = read.nextInt();
        
         System.out.println("Ingrese otro número: ");
        int num2 = read.nextInt();
        
        resultadoSuma = Sumar(num1, num2);
        
        System.out.println(num1 + " + " + num2 + " = " + resultadoSuma);
    }
    
    public static int Sumar(int numA, int numB){
        int result = numA + numB;
        return result;
    }
}
