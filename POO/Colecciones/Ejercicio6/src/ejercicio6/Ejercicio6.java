package ejercicio6;

import ejercicio6.servicios.TiendaServicio;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        TiendaServicio ps = new TiendaServicio();
        int opcion;
        
        do {
            System.out.println("---Menú---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio de un producto");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            opcion = read.nextInt();
            
            switch(opcion){
                case 1: 
                    ps.agregarProductoTienda();
                    break;
                case 2: 
                    System.out.println("Ingresar nombre del producto a modificar");
                    String nombreModificar = read.next().toLowerCase();
                    ps.modificarProducto(nombreModificar);
                    break;
                case 3: 
                    System.out.println("Ingresar nombre del producto a eliminar");
                    String nombreEliminar = read.next().toLowerCase();
                    ps.eliminarProducto(nombreEliminar);
                    break;
                case 4: 
                    System.out.println("--Listado de productos--");
                    ps.mostrarProductos();
                    break;
                case 5: 
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Ingresar una opción válida.");
            }
            
            
            
        }while(opcion!=5);
        
        
    }

}
