

package ejercicio11;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        int num1, num2;
        int opcion;
        boolean terminar = false;
        String confirmacion;
        Scanner read = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese un número entero positivo: ");
            num1 = read.nextInt();
            System.out.println("Ingrese otro número entero positivo: ");
            num2 = read.nextInt();
        } while (num1 <= 0 || num2 <= 0 );
        
        
       while (terminar == false){
            System.out.println("------------------");
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Restar");
            System.out.println("Elija una opción: ");
            opcion = read.nextInt();
            read.nextLine();
           switch(opcion){
               case 1: 
                   int suma = num1 + num2;
                   System.out.println(num1 + "+" + num2 + "=" + suma);
                   break;
               case 2: 
                   int resta =  num1 - num2;
                   System.out.println(num1 + "-" + num2 + "=" + resta);
                   break;
               case 3: 
                   int producto = num1 * num2;
                   System.out.println(num1 + "*" + num2 + "=" + producto);
                   break;
               case 4: 
                   double division = num1 / num2;
                   System.out.println(num1 + "/" + num2 + "=" + division);
                   break;
               case 5:
                    terminar = true;
                    break;
               default: 
                    System.out.println("Opción inválida.");
                    break;
           }
           if (terminar){
           System.out.println("Desea salir del programa?(S/N)");
           confirmacion = read.nextLine();
                if (confirmacion.equals("S")||confirmacion.equals("s")) {
                    terminar = true;
                } else if (confirmacion.equals("N")||confirmacion.equals("n")) {
                    terminar = false;
                } else {
                    System.out.println("Confirmacion ingresada inválida.");
                }
           }
           
       }
    }

}
