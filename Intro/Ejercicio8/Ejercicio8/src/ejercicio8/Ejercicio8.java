

package ejercicio8;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
       int longitudPalabra;
        Scanner read = new Scanner(System.in);
       
       System.out.println("Ingrese una frase o palabra de 8 caracteres: ");
       String frase = read.nextLine();
       
       longitudPalabra = frase.length();
       if (longitudPalabra == 8){
           System.out.println("CORRECTO");
       } else {
            System.out.println("INCORRECTO");
       }
       
    }

}
