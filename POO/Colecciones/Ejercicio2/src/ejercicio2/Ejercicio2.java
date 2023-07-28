
package ejercicio2;

import ejercicio2.entidades.Perro;
import ejercicio2.servicios.PerroServicio;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        PerroServicio ps = new PerroServicio();
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        String opcion;
        do {
            ps.agregarPerro();
            System.out.println("¿Desea seguir ingresando perros? (S/N)");
            opcion = scanner.next();
        } while (!opcion.equalsIgnoreCase("N"));

        ps.mostrarPerros();

        System.out.println("Ingrese el nombre del perro a buscar: ");
        String nombrePerroBuscar = scanner.next();
        
        Perro perroABuscar = new Perro(nombrePerroBuscar);

        ps.buscarPerro(perroABuscar);
    }
}


