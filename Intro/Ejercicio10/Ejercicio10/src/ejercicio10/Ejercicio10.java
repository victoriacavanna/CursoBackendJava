

package ejercicio10;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        int limite;
        double suma;
        double num;
        
        Scanner read = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese valor límite positivo: ");
            limite = read.nextInt();
        } while (limite <= 0);
        
        suma = 0;
        while (suma < limite){
            System.out.println("Ingrese un número: ");
            num = read.nextInt();
            suma += num;
        }
        
        System.out.println( suma + " supera el límite de "+ limite);
    }

}
