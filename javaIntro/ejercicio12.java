package ejercicio12;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
       String cadena;
       int correcto=0;
       int incorrecto=0;
       int longitud;
        Scanner read = new Scanner(System.in);
       
       do {
           System.out.println("Ingrese una cadena");
           cadena = read.nextLine();
           longitud = cadena.length();
           if (longitud <= 5 && cadena.substring(0,1).equals("x") && cadena.substring(longitud-1,longitud).equals("o")  ){
               correcto++;
           } else {
               incorrecto++;
           }
        } while (!cadena.equals("&&&&&"));
       
       System.out.println("-----Informe de lecturas---- ");
       System.out.println("Correctas: " + correcto);
       System.out.println("Incorrectas: " + incorrecto);
    }

}