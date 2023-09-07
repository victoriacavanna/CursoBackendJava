package ejercicio4;

import ejercicio4.entidades.Circulo;
import ejercicio4.entidades.Rectangulo;

public class Ejercicio4 {

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(2, 2);
        Circulo circulo1 = new Circulo(5);

        System.out.println("Área del rectángulo: " + rectangulo1.area());
        System.out.println("Perímetro del rectángulo: " + rectangulo1.perimetro());
        System.out.println("---------------------------------------");
        System.out.println("Área del círculo: " + circulo1.area());
        System.out.println("Perímetro del círculo: " + circulo1.perimetro());
    }

}
