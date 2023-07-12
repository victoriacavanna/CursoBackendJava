
package Servicios;
import Entidades.Cadena;
import java.util.Scanner;

public class CadenaService {
    Cadena frase = new Cadena();
    Scanner read = new Scanner(System.in);
    
    public int mostrarVocales(Cadena frase){
        int longitud = frase.getLongitud();
        String fraseIngresada = frase.getFrase().toLowerCase();
        int vocales = 0;
        
        for (int i = 0; i < longitud; i++){
            char caracter = fraseIngresada.charAt(i);
            if (caracter == 'a' || caracter == 'e'|| caracter == 'i'||caracter == 'o'||caracter == 'u' ){
                vocales ++;
            }
        }
        return vocales;       
    }
    
    public void invertirFrase(Cadena frase){
        int longitud = frase.getLongitud();
        String fraseIngresada = frase.getFrase();
        String fraseInvertida = "";
        
        for (int i = longitud-1; 0 <= i; i--){
            fraseInvertida += fraseIngresada.charAt(i);
        }
        System.out.println(fraseInvertida);
    }
    
    public void vecesRepetido(Cadena frase, char letra){
        int repetido = 0;
        int longitud = frase.getLongitud();
        String fraseIngresada = frase.getFrase().toLowerCase();
        
        for (int i = 0; i < longitud; i++){
            if (fraseIngresada.charAt(i) == letra){
                repetido++;
            }
        }
        System.out.println("El carácter " + letra + " se repite "+ repetido + " veces");
    }
    
    public void compararLongitud(Cadena frase, String fraseNueva){
       int longitudFraseInicial = frase.getLongitud();
       int longitudFraseNueva = fraseNueva.length();
       
       if (longitudFraseInicial > longitudFraseNueva){
           System.out.println("La frase inicial es más larga que la nueva.");
       } else if (longitudFraseInicial == longitudFraseNueva){
           System.out.println("La frase inicial tiene la misma longitud que la nueva.");
       } else {
           System.out.println("La frase nueva es más larga que la inicial.");
       }
    }
    
    public void unirFrases(Cadena frase, String fraseNueva){
        String fraseInicial = frase.getFrase();
        String fraseFinal = fraseInicial.concat(fraseNueva);
        System.out.println("La frase final es: " + fraseFinal);
    }
    
    public void reemplazar(Cadena frase){
        String fraseInicial = frase.getFrase();
        
        System.out.println("Ingresar un carácter: ");
        String caracterNuevo = read.next();
        
        String fraseFinal = fraseInicial.replace("a", caracterNuevo);
        System.out.println("La frase final es: " + fraseFinal);
    }
    
    public boolean contiene(Cadena frase){
        System.out.println("Ingresar letra a buscar: ");
        String letra = read.next();
        return (frase.getFrase().contains(letra));
    }
}
