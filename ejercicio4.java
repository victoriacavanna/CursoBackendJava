package ejercicio4;
import java.util.Scanner;


public class Ejercicio4 {

    public static void main(String[] args) {
        double gradosFah;
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingresar temperatura en grados centígrados: ");
        double gradosCent = read.nextDouble();
        
        gradosFah = 32 + (9 * gradosCent/5);
        
        System.out.println(gradosCent + "°C equivalen a " + gradosFah + "°F");
    }

}