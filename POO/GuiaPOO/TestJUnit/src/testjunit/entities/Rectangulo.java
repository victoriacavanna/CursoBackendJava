
package testjunit.entities;

public class Rectangulo {
    //Atributos
    private double ancho;
    private double largo;
    private String color;
    private boolean active;
    
    //Constructores
    public Rectangulo(){
        
    }

    public Rectangulo(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
        this.color = "Rojo";
        this.active = true;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    
    
}
