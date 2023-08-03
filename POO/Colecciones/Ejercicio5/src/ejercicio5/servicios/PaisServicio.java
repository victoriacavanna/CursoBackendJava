
package ejercicio5.servicios;

import ejercicio5.entidades.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import ejercicio5.utilidades.Comparador;

public class PaisServicio {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    TreeSet<Pais> paises= new TreeSet<>(Comparador.ordenarPorNombre);
    public void cargarPaises(){
        String opcion;
        do {
            paises.add(cargarPais());
            System.out.println("¿Desea seguir ingresando países? (S/N)");
            opcion = read.next();
        } while (!opcion.equalsIgnoreCase("n") && !opcion.equalsIgnoreCase("no"));
        mostrarPaises();
    }
    public Pais cargarPais(){
        System.out.println("Ingresar nombre del país: ");
        String nombre = read.next();
        return new Pais(nombre);
    }
    public void mostrarPaises(){
        for (Pais aux : paises){
            System.out.println(aux);
        }
        System.out.println("Cantidad de países: " + paises.size());
    }
    public void buscarPais(String paisABuscar){
        Iterator <Pais> it = paises.iterator();
        boolean encontrado = false;
        while(it.hasNext()){
            Pais paisActual = it.next();
            if (paisActual.getPais().equalsIgnoreCase(paisABuscar)){
                it.remove();
                encontrado = true;
                System.out.println("Eliminado con éxito");
            } 
        }
        if (encontrado){
            mostrarPaises();
        } else {
            System.out.println("No se encontró el país ingresado.");
        }
    }
}
