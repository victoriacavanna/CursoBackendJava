

package ejercicio14;
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double euros;
        String divisa;
        System.out.println("Ingrese el monto de euros a convertir: ");
        euros = read.nextDouble();
        
        read.nextLine();
        
        System.out.println("Ingrese a que moneda desea convertir: dolares, yenes o libras");
        divisa = read.nextLine().toLowerCase();
        convertir(euros, divisa);
    }
    public static void convertir(double cantidad, String moneda){
        double conversion;
        if (moneda.equals("libras")){
            conversion = cantidad * 0.86;
        } else if (moneda.equals("dolares")){
            conversion = cantidad * 1.28611;
        } else if (moneda.equals("yenes")){
            conversion = cantidad * 129.852;
        } else {
            conversion = 0;
        }
        
        System.out.println(cantidad + "3€ = " + conversion +" "+ moneda);
    }

}
