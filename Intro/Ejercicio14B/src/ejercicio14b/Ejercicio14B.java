

package ejercicio14b;
import java.util.Scanner;

public class Ejercicio14B {

    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int opcion = 0;
        double valor = 1;
        System.out.println("Ingresar cantidad de euros: ");
        valor = read.nextDouble();
        
        while(opcion != 5){
            mostrarMenu();
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    conversor(valor, 1);
                case 2:
                    conversor(valor, 2);
                case 3:
                    conversor(valor, 3);
                case 4:
                    valor = read.nextDouble();
                case 5:
                    System.out.println("Fin de programa...");
                default:
                    System.out.println("Opcion inválida.");
            }
        }
    }
    public static void mostrarMenu(){
        System.out.println("Ingrese opción deseada");
        System.out.println("1. Dólares");
        System.out.println("2. Libras");
        System.out.println("3. Yenes");
        System.out.println("4. Cambiar valor en EUROS(€) a convertir");
        System.out.println("5. Salir");
    }

    public static void conversor(double cantidad, int moneda){
        switch (moneda) {
            case 1:
                System.out.println(cantidad + "€ = " + cantidad * 1.28611 + " US$");
            case 2:
                System.out.println(cantidad + "€ = " + cantidad * 0.86 + " libras");
            case 3:
                System.out.println(cantidad + "€ = " + cantidad * 129.852 + " ¥");
        }
    }
}

