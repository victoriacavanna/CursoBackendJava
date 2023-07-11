/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).*/
package entidades;

import java.util.Scanner;

public class Circunferencia {

    Scanner read = new Scanner(System.in);
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        System.out.println("Ingresar radio de la circunferencia: ");
        this.radio = read.nextDouble();
    }

    public void area() {
        double areaCircunferencia;
        areaCircunferencia = Math.PI * Math.pow(radio, 2);
        System.out.println("Area: " + areaCircunferencia);
    }

    public void perimetro() {
        double perimetroCircunferencia;
        perimetroCircunferencia = 2 * Math.PI * radio;
        System.out.println("Perímetro: " + perimetroCircunferencia);
    }
}
