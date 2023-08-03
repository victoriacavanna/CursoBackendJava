
package ejercicio6.servicios;

import java.util.HashMap;
import java.util.Scanner;


public class TiendaServicio {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Double> productos = new HashMap<>(); 
    public void agregarProductoTienda(){
        System.out.println("Ingresar nombre del producto: ");
        String nombre = read.next().toLowerCase();
        System.out.println("Ingresar precio del producto: ");
        Double precio = read.nextDouble();
        productos.put(nombre, precio);
    }
      
    public void modificarProducto(String nombre){
        if (productos.containsKey(nombre)){
            Double precioNuevo = read.nextDouble();
            productos.put(nombre, precioNuevo);
            System.out.println("Se modificó el precio correctamente.");
        } else {
            System.out.println("No se encontró el producto a modificar.");
        }
    }
    
    public void eliminarProducto(String nombre){
        if(productos.containsKey(nombre)){
            productos.remove(nombre);
        }
    }
    
    public void mostrarProductos(){
        for (String nombre : productos.keySet()){
            double precio = productos.get(nombre);
            System.out.println("Producto: " + nombre + " | Precio: " + precio);
        }
    }
}
