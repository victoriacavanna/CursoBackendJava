package ejercicio3.entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    protected int carga;

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        super.crearElectrodomestico();

        System.out.println("Carga del lavarropas (en kg): ");
        int carga = read.nextInt();

        this.carga = carga;

    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        double precioBase = precio;
        if (carga > 30) {
             precioBase += 500;
        } 
        setPrecio(precioBase);
    }

    @Override
    public void mostrarProducto() {
        System.out.println("Lavadora[ precio: $" + precio + " , color: " + color + " , consumo: " + consumo + " , peso: " + peso + "kg, carga: " + carga + " kg ]");
    }

}
