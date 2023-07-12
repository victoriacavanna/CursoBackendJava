

package ejercicio11;

import java.util.Date;
import java.util.Scanner;



public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Date fechaActual = new Date();
        
        System.out.println("Ingresar el día: ");
        int dia = read.nextInt();
        
        System.out.println("Ingresar el mes: ");
        int mes = read.nextInt();
        
        System.out.println("Ingresar el año: ");
        int anio = read.nextInt();
        
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        
        int diferenciaAnios = fechaActual.getYear() - fecha.getYear();
        
        System.out.println("Fecha ingresada: " + fecha);
        System.out.println("Fecha actual: " + fechaActual);
        System.out.println("La diferencia de años es de: "+ diferenciaAnios);
        
    }

}
