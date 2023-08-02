
package ejercicio4.utilidades;

import ejercicio4.entidades.Pelicula;
import java.util.Comparator;


public class Comparadores{
    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
             return p1.getTitulo().compareToIgnoreCase(p2.getTitulo());
        }
    };
    public static Comparator<Pelicula> ordenarDuracionMayor = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            
            return o2.getHoras().compareTo(o1.getHoras());
            
        }
    };
    public static Comparator<Pelicula> ordenarDuracionMenor = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            
            return o1.getHoras().compareTo(o2.getHoras());
            
        }
    };
    public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
             return p1.getDirector().compareToIgnoreCase(p2.getDirector());
        }
    };
}
