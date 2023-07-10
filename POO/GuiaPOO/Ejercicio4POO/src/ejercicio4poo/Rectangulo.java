/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.*/
package ejercicio4poo;

import java.util.Scanner;

public class Rectangulo {
    Scanner read = new Scanner(System.in);
    private double base;
    private double altura;
    
    public Rectangulo(){
        
    }
    
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        System.out.println("Ingresar base: ");
        this.base = read.nextDouble();
        System.out.println("Ingresar altura: ");
        this.altura = read.nextDouble();
    }
    
    public double calcularSuperficie(){
        double resultado;
        resultado = base * altura;
        return resultado;
    }
    public double calcularPerimetro(){
        double resultado;
        resultado = (base + altura) * 2;
        return resultado;
    }
    
    public void dibujarRectangulo(){
        for (int i = 0; i<base; i++){
            for (int j = 0; j<altura; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
