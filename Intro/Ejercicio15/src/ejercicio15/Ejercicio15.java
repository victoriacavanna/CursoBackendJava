

package ejercicio15;
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        int [] vector = new int [100];
        llenarVector(vector);
        for (int i = 99; i >= 0; i--){
            System.out.println(vector[i]);
        }
    }
    public static void llenarVector(int[]arreglo){
        for (int i = 0; i < 100; i++){
            arreglo[i] = i + 1;
        }
    }

}
