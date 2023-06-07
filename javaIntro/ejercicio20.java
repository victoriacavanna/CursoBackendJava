package ejercicio20;
import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        int [][] cuadrado = new int [3][3];
        llenarMatriz(cuadrado, 3);
        mostrarMatriz(cuadrado, 3);
        if (esMagico(cuadrado, 3)){
            System.out.println("Es mágico");
        } else {
            System.out.println("No es mágico");
        }
    }
    
    public static void llenarMatriz(int[][] matriz, int n){
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                
                do {
                    System.out.println("Ingrese un valor válido (1-9) para la posición ["+i+"]"+ "["+j+"]");
                    matriz[i][j] = read.nextInt();
                } while (matriz[i][j] > 9 || matriz[i][j] < 1);
                
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
    
    public static boolean esMagico(int[][] matriz, int n){
        int sumaFilas = 0;
        int sumaColumnas = 0;
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;
        
        for (int j = 0; j < n; j++){
            sumaFilas += matriz[0][j];
        }
        
        for (int i = 0; i < n; i++){
            int sumaFila = 0;
            int sumaColumna = 0;
            
            for (int j = 0; j < n; j++){
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }
            
            if (sumaFila != sumaFilas || sumaColumna != sumaFilas) {
                return false;
            }
        }
        
        for (int i = 0; i < n; i++) {
            sumaDiagonalPrincipal += matriz[i][i];
        }

        if (sumaDiagonalPrincipal != sumaFilas) {
            return false;
        }
        
        for (int i = 0; i < n; i++) {
            sumaDiagonalSecundaria += matriz[i][n - 1 - i];
        }
        
        return sumaDiagonalSecundaria == sumaFilas;
    }
}