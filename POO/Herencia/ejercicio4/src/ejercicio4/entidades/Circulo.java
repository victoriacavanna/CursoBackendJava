
package ejercicio4.entidades;

import ejercicio4.interfaces.calculosFormas;
import static java.lang.Math.pow;


public class Circulo implements calculosFormas{
    protected double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    
    public double area() {
        return CONSTANTEPI * pow(radio, 2);
    }

    @Override
    public double perimetro() {
        return CONSTANTEPI * (radio * 2);
    }
    
}
