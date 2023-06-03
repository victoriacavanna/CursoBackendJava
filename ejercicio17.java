package ejercicio17;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresar tamaño del vector: ");
        int n = read.nextInt();
        int [] vector = new int[n];
        llenarVector(vector, n);
        mostrarVector(vector, n);
        contadorDigitos(vector, n);
    }
    public static void llenarVector(int [] arreglo, int longitud){
        Random random = new Random();
        for (int i = 0; i < longitud; i++){
            arreglo[i] = random.nextInt(100000);
        }
    }
    public static void mostrarVector(int [] arreglo,int longitud){
        for (int i = 0; i < longitud; i++){
            System.out.print(arreglo[i] + " | ");
        }
    }
    public static void contadorDigitos(int [] arreglo, int longitud){
        int unDigito = 0;
        int dosDigitos = 0;
        int tresDigitos= 0;
        int cuatroDigitos = 0;
        int cincoDigitos = 0;
        
        for (int i = 0; i < longitud; i++){
            int digitos = (int) Math.log10(arreglo[i]) + 1;
            switch (digitos){
                case 1: 
                    unDigito++;
                    break;
                case 2: 
                    dosDigitos++;
                    break;
                case 3: 
                    tresDigitos++;
                    break;
                case 4: 
                    cuatroDigitos++;
                    break;
                case 5: 
                    cincoDigitos++;
                    break;
                default: 
                    System.out.println("Tiene más de cinco dígitos");
                    break;
            }
        }
        
        System.out.println("---Contador dígitos---");
        System.out.println("Numeros con 1 dígito: " + unDigito);
        System.out.println("Numeros con 2 dígitos: " + dosDigitos);
        System.out.println("Numeros con 3 dígitos: " + tresDigitos);
        System.out.println("Numeros con 4 dígitos: " + cuatroDigitos);
        System.out.println("Numeros con 5 dígitos: " + cincoDigitos);
    }
}