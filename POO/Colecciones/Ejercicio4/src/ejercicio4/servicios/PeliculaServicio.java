
package ejercicio4.servicios;

import ejercicio4.entidades.Pelicula;
import ejercicio4.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaServicio {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peliculas = new ArrayList();
    String opcion;
    public void cargarPeliculas(){
        do {
            peliculas.add(cargarPelicula());
            System.out.println("¿Desea seguir ingresando películas?");
            opcion = read.next();
        } while(!opcion.equalsIgnoreCase("n") && !opcion.equalsIgnoreCase("no"));
    }
    
    public Pelicula cargarPelicula(){
        System.out.println("Ingresar título: ");
        String titulo = read.next();
        System.out.println("Ingresar director: ");
        String director = read.next();
        System.out.println("Ingresar duración (horas): ");
        int duracion = read.nextInt();
        return new Pelicula(titulo, director, duracion);
    }
    
    public void mostrarPeliculas(){
        for (Pelicula aux : peliculas){
            System.out.println(aux.toString());
        }
    }
    
    public void mostrarMasUnaHora(){
        for (Pelicula aux : peliculas){
            if (aux.getHoras() > 1){
                System.out.println(aux.toString());
            }
        }
    }
    
    public void ordenarPorTitulo(){
        Collections.sort(peliculas, Comparadores.ordenarPorTitulo);
        mostrarPeliculas();
    }
    public void ordenarDuracionMayor(){
        Collections.sort(peliculas, Comparadores.ordenarDuracionMayor);
        mostrarPeliculas();
    }
    public void ordenarDuracionMenor(){
        Collections.sort(peliculas, Comparadores.ordenarDuracionMenor);
        mostrarPeliculas();
    }
    public void ordenarPorDirector(){
        Collections.sort(peliculas, Comparadores.ordenarPorDirector);
        mostrarPeliculas();

    }
}

