
package Entidad;
import java.util.Arrays;

public class EjercicioArrays {
    private double [] arrayA = new double [50];
    private double [] arrayB = new double [20];

    public double[] getArrayA() {
        return arrayA;
    }

    public void setArrayA(double[] arrayA) {
        this.arrayA = arrayA;
    }

    public double[] getArrayB() {
        return arrayB;
    }

    public void setArrayB(double[] arrayB) {
        this.arrayB = arrayB;
    }
    
    public void generarValores(double [] array){
        for (int i = 0; i < array.length; i++){
            double numero = Math.random() * 10;
            array[i] = Math.round(numero * 100.0) / 100.0;
        }
    }
    
    public void mostrarArray(double [] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " | ");
        }
    }
    
    public void ordenarVector(double[] array){
        Arrays.sort(array);
    }
    
    public void llenarVector() {
        ordenarVector(arrayA);
        for (int i = 0; i < 10; i++) {
            arrayB[i] = arrayA[i];
        }
        Arrays.fill(arrayB, 10, 20, 0.5);
    }
}

