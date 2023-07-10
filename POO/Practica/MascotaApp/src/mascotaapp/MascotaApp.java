package mascotaapp;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;

public class MascotaApp {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Mascota m1 = new Mascota();
        System.out.println("Ingresar datos de mascota: ");
        System.out.println("Nombre: ");
        m1.nombre = read.next();
        System.out.println("Apodo: ");
        m1.apodo = read.next();
        System.out.println("Tiene cola: ");
        m1.cola = read.nextBoolean();
        System.out.println("Tipo animal: ");
        m1.tipo = read.next();
        System.out.println("Raza: ");
        m1.raza = read.next();
        System.out.println("Edad: ");
        m1.edad = read.nextInt();
        System.out.println("Color: ");
        m1.color = read.next();

        System.out.println("Tipo mascota: " + m1.tipo);
        System.out.println("Nombre mascota: " + m1.nombre);
        System.out.println("Apodo mascota: " + m1.apodo);
        System.out.println("Edad mascota: " + m1.edad);
        System.out.println("Color mascota: " + m1.color);
        System.out.println("Raza mascota: " + m1.raza);
        System.out.println("Tienen cola mascota: " + m1.cola);
    }

}
 