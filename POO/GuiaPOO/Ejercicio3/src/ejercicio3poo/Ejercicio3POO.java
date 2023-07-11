

package ejercicio3poo;
import entidades.Operacion;

public class Ejercicio3POO {

    public static void main(String[] args) {
        Operacion calculo1 = new Operacion();
        
        calculo1.crearOperacion();
        System.out.println("Suma: " + calculo1.sumar());
        System.out.println("Resta: "  + calculo1.restar());
        System.out.println("División: "  + calculo1.dividir());
        System.out.println("Multiplicación: "  + calculo1.multiplicar());
    }

}
