package ejercicio2.entidades;

import ejercicio2.enums.Colores;
import java.util.Scanner;

public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumo;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(char letra) {
        char caracter = Character.toUpperCase(letra);

        if (caracter < 'A' || caracter > 'F') {
            caracter = 'F';
        }

        setConsumo(caracter);

        return caracter;
    }

    public String comprobarColor(String color) {
        Colores[] valores = Colores.values();

        for (Colores c : valores) {
            if (c.name().equalsIgnoreCase(color)) {
                return color;
            }
        }
        color = "blanco";
        return color;
    }

    

    public double precioFinal() {
        double precioFinal = precio;
        char letra = Character.toUpperCase(getConsumo());

        switch (letra) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
            default:
                precioFinal += 0;
                break;
        }

        if (peso >= 1 && peso <= 19) {
            precioFinal += 100;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 500;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 800;
        } else if (peso >= 80) {
            precioFinal += 1000;
        }

        return precioFinal;
    }

    
    public void mostrarProducto() {
        System.out.println("Electrodomestico[ precio: $" + precio + " , color: " + color + " , consumo: " + consumo + " , peso: " + peso + "kg ]");
    }
}
