
package Servicios;
import Entidades.Matematica;

public class MatematicaService {
    Matematica calculo = new Matematica();
    
    public double devolverMayor(Matematica calculo){
        double num1 = calculo.getNumA();
        double num2 = calculo.getNumB();
        
        if (num1 < num2){
            return num2;
        } else {
            return num1;
        }
    }
    
    public void calcularPotencia(Matematica calculo){
        double num1 = calculo.getNumA();
        double num2 = calculo.getNumB();
        double mayor;
        double menor;
        if (devolverMayor(calculo) == num1){
            mayor = num1;
            menor = num2;
        } else {
            mayor = num2;
            menor = num1;
        }
        mayor = Math.floor(mayor);
        menor = Math.floor(menor);
        
        int potencia = (int) Math.pow(mayor, menor);
        
        System.out.println(mayor + " elevado a " + menor + " es igual a " + potencia);
    }
    
    public void calculaRaiz(Matematica calculo){
        double num1 = calculo.getNumA();
        double num2 = calculo.getNumB();
        double mayor;
        double menor;
        if (devolverMayor(calculo) == num1){
            menor = num2;
        } else {
            menor = num1;
        }
        menor = Math.abs(menor);
        double raiz = Math.sqrt(menor);
        System.out.println("Raíz cuadrada de " + menor + " es "+ raiz);
         
    }
}
