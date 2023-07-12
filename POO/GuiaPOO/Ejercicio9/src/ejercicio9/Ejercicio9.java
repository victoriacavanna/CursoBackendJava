

package ejercicio9;
import Entidades.Matematica;
import Servicios.MatematicaService;


public class Ejercicio9 {

    public static void main(String[] args) {
        MatematicaService matematicaService = new MatematicaService();
        Matematica matematica = new Matematica();
        
        double numA = Math.random()*10;
        matematica.setNumA(numA);
        
        double numB = Math.random()*10;
        matematica.setNumB(numB);
        
        System.out.println("Numero A: " + matematica.getNumA());
        System.out.println("Numero B: " + matematica.getNumB());
        
        matematicaService.calcularPotencia(matematica);
        matematicaService.calculaRaiz(matematica);

    }

}
