

package ejercicio21;
import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        int [][] matrizM = new int [5][5];
        int [][] matrizP = new int [3][3];
        llenarMatriz(matrizM, 5);
        mostrarMatriz(matrizM, 5);
        llenarMatriz(matrizP, 3);
        mostrarMatriz(matrizP,3);
        matrizContenida(matrizM, matrizP, 5, 3);
    }
    public static void llenarMatriz(int[][] matriz, int n){
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                
               System.out.println("Ingrese un valor para la posición ["+i+"]"+ "["+j+"]");
                    matriz[i][j] = read.nextInt();
  
                
            }
        }
    }
    
    public static void mostrarMatriz(int[][] matriz, int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matriz[i][j] + " | ");                
            }
            System.out.println();
        }
    }
    
    public static void matrizContenida(int[][] matrizG,int[][] matrizC, int nG, int nC){
        for (int i = 0; i < nG; i++){
            for (int j = 0; j < nG; j++){
                if (matrizG[i][j] == matrizC[0][0]){
                    for (int k = 1; k < nC; k++){
                        for (int m = 1; m < nC; m++){
                            if (matrizC[k][m] == matrizG[i][j]){
                                System.out.println("El primer elemento de la matriz P se encuentra en la posición ["+i+"]"+"["+j+"]");
                            }
                        }
                    }
                }                
            }
            System.out.println();
        }
    }
}
