package ejercicio4.entidades;

import ejercicio4.interfaces.calculosFormas;

public class Rectangulo implements calculosFormas {

    protected double base;
    protected double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return (base + altura) * 2;
    }


    
    

}
