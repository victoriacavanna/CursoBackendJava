package ejercicio19;
import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        int [] [] matrizCuadrada = new int [3][3];
        int [] [] matrizTranspuesta = new int [3][3];
        llenarVector(matrizCuadrada);
        System.out.println("---Matriz Original---");
        mostrarMatriz(matrizCuadrada);
        System.out.println("---Matriz Transpuesta---");
        transpuestaMatriz(matrizCuadrada, matrizTranspuesta);
        if(esAntisimetrica(matrizCuadrada, matrizTranspuesta)){
            System.out.println("Es antisimetrica");
        } else {
            System.out.println("No es antisimetrica");
        }
        
    }
    public static void llenarVector(int [] [] matriz){
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Ingrese un número para la posición ["+i+"]" + "["+j +"]" );
                matriz[i][j] = read.nextInt();
            }
        }
    }
    public static void mostrarMatriz(int [] [] matriz){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
               System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }
    public static void transpuestaMatriz(int [] [] matriz, int [] [] matrizTranspuesta){
        for (int j = 0; j < 3; j++){
            for (int i = 0; i < 3; i++){
             matrizTranspuesta[j][i] = matriz[j][i];
              System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }
    public static boolean esAntisimetrica(int [] [] matriz,int [] [] matrizTranspuesta ){
        boolean resultado = false;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
             if (matrizTranspuesta[i][j] == -matriz[i][j] || -matrizTranspuesta[i][j] == matriz[i][j]){
                 resultado = true;
             } else {
                 resultado = false;
             }
            }
        }
        return resultado;
    }
}