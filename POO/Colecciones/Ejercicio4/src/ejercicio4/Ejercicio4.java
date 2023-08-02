

package ejercicio4;

import ejercicio4.servicios.PeliculaServicio;


public class Ejercicio4 {

    public static void main(String[] args) {
        PeliculaServicio ps = new PeliculaServicio();
        
        ps.cargarPeliculas();
        
        System.out.println("----Listado de películas----");
        ps.mostrarPeliculas();
        
        System.out.println("---Peliculas de más de una hora: -----");
        ps.mostrarMasUnaHora();
        
        System.out.println("---Ordenadas de acuerdo a duración (mayor a menor)");
        ps.ordenarDuracionMayor();
        
        System.out.println("---Ordenadas de acuerdo a duración (menor a mayor)");
        ps.ordenarDuracionMenor();
        
        System.out.println("----Ordenadas alfabeticamente por título----");
        ps.ordenarPorTitulo();
        
        System.out.println("----Ordenadas alfabeticamente por director----");
        ps.ordenarPorDirector();
    }

}
