

package ejercicio16;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        System.out.println("Ingresar tamaño del vector: ");
        int n = read.nextInt();
        int [] vector = new int[n];
        llenarVector(vector, n);
        System.out.println("Ingresar valor a buscar:  ");
        int valor = read.nextInt();
        mostrarVector(vector, n);
        buscarValor(vector, n, valor);
    }
    public static void llenarVector(int [] arreglo, int longitud){
        Random random = new Random();
        for (int i = 0; i < longitud; i++){
            arreglo[i] = random.nextInt(5);
        }
    }
    public static void mostrarVector(int [] arreglo,int longitud){
        for (int i = 0; i < longitud; i++){
            System.out.print(arreglo[i] + " | ");
        }
    }
    public static void buscarValor(int [] arreglo,int longitud, int num){
        System.out.println();
        int repetido = 0;
        for (int i = 0; i < longitud; i++){
            if (arreglo[i] == num){
               System.out.println(num + " se encuentra en la posición: " + (i + 1));
               repetido++;
            }
        }
        if (repetido > 0){
            System.out.println("El número ("+ num +") se encuentra repetido " + repetido + " veces");
        }
    }
    
}
