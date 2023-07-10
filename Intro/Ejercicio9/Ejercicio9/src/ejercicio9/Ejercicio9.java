

package ejercicio9;
import java.util.Scanner;


public class Ejercicio9 {

    public static void main(String[] args) {
        boolean validacionA;
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o palabra que empiece con la letra A: ");
        String texto = read.nextLine();
        
        validacionA = texto.startsWith("A") || texto.startsWith("a") ;
        
        if (validacionA){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        
        
    }

}
