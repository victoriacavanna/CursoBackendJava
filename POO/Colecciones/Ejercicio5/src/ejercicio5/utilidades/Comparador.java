
package ejercicio5.utilidades;
import ejercicio5.entidades.Pais;
import java.util.Comparator;

public class Comparador {
        public static Comparator<Pais> ordenarPorNombre = new Comparator<Pais>() {
            @Override
            public int compare(Pais p1, Pais p2) {
                return p1.getPais().compareTo(p2.getPais());
            }
        };

}
