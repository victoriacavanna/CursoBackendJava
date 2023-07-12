

package ejercicio10;
import Entidad.EjercicioArrays;


public class Ejercicio10 {

    public static void main(String[] args) {
        EjercicioArrays ejercicio = new EjercicioArrays();

        ejercicio.generarValores(ejercicio.getArrayA());
        System.out.println("Arreglo A sin ordenar:");
        ejercicio.mostrarArray(ejercicio.getArrayA());

        ejercicio.llenarVector();

        System.out.println("Arreglo A ordenado de menor a mayor:");
        ejercicio.mostrarArray(ejercicio.getArrayA());
        
        System.out.println("Arreglo B combinado:");
        ejercicio.mostrarArray(ejercicio.getArrayB());
    }

}
