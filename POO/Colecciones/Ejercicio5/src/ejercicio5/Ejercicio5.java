

package ejercicio5;

import ejercicio5.servicios.PaisServicio;
import java.util.Scanner;


public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        PaisServicio ps = new PaisServicio();
        ps.cargarPaises();
        
        System.out.println("Ingresar nombre del pais a eliminar: ");
        String paisABuscar = read.next();
        ps.buscarPais(paisABuscar);
    }

}
