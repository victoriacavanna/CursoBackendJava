

package ejercicio1;

import ejercicio1.servicios.PerroServicio;
import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {
        String opcion;
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        PerroServicio ps = new PerroServicio();
        
        
        do {
            ps.agregarPerro();
            System.out.println("¿Desea seguir ingresando perros? (S/N)");
            try{
            opcion = read.next();
            } catch (Exception e){
                System.out.println("Ha ocurrido un error al leer la opción.");
                System.out.println("Detalles del error: " + e.getMessage());
                opcion = "N";
            }
        } while (!opcion.equals("N") && !opcion.equals("n") );
        
        ps.mostrarPerros();
    }
    

}
