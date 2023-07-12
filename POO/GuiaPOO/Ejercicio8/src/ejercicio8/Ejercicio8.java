

package ejercicio8;
import Entidades.Cadena;
import Servicios.CadenaService;

public class Ejercicio8 {

    public static void main(String[] args) {
        CadenaService fraseService = new CadenaService();
        
        Cadena frase = new Cadena("casa");
        
        fraseService.compararLongitud(frase, "hola");
        if (fraseService.contiene(frase)){
            System.out.println("La letra está en la frase inicial");
        } else {
            System.out.println("La letra no está en la frase inicial");
        }
        
        fraseService.invertirFrase(frase);
        fraseService.unirFrases(frase, "blanca");
        System.out.println("Hay " + fraseService.mostrarVocales(frase) + " vocales");
        fraseService.vecesRepetido(frase, 'a');
        fraseService.reemplazar(frase);
    }

}
