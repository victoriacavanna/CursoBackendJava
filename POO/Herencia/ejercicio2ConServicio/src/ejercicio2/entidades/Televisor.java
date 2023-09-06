package ejercicio2.entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    protected double resolucion;
    protected boolean sintonizador;

    public Televisor() {
        super();
        resolucion = 0;
        sintonizador = false;
    }

    public Televisor(double resolucion, boolean sintonizador) {
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Televisor(double resolucion, boolean sintonizador, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (resolucion > 40) {
            precioFinal += precioFinal * 0.3;
        }
        if (sintonizador) {
            precioFinal += 500;
        }
        return precioFinal;
    }

    @Override
    public void mostrarProducto() {
        System.out.println("Televisor[ precio: $" + precio + " , color: " + color + " , consumo: " + consumo + " , peso: " + peso + "kg, resolucion: " + resolucion + " pulgadas, sintonizador: " + (sintonizador ? "Sí" : "No") + " ]");

    }
}
