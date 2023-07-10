

package ejercicio18;

import java.util.Random;


public class Ejercicio18 {

    public static void main(String[] args) {
        int [] [] matrizCuadrada = new int [4][4];
        llenarVector(matrizCuadrada);
        System.out.println("---Matriz Original---");
        mostrarMatriz(matrizCuadrada);
        System.out.println("---Matriz Transpuesta---");
        transpuestaMatriz(matrizCuadrada);
    }
    public static void llenarVector(int [] [] matriz){
        Random random = new Random();
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
            matriz[i][j] = random.nextInt(10);
            }
        }
    }
    public static void mostrarMatriz(int [] [] matriz){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
               System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }
    public static void transpuestaMatriz(int [] [] matriz){
        for (int j = 0; j < 4; j++){
            for (int i = 0; i < 4; i++){
             System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }
}
