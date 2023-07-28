
package ejercicio2.utilidades;

import ejercicio2.entidades.Perro;
import java.util.Comparator;


public class Comparadores {
    public static Comparator<Perro> ordenarPorNombreDesc = new Comparator<Perro> () {
        @Override
        public int compare(Perro o1, Perro o2) {
            
            return o2.getNombre().compareTo(o1.getNombre());
            
        }
    };
}
