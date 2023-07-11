
package Servicios;
import Entidades.Persona;
import java.util.Scanner;
public class PersonaService {
    
    public Persona crearPersona(){
        Scanner read = new Scanner(System.in);
        Persona persona = new Persona();
        
        
        System.out.println("Ingresar su nombre: ");
        String nombre = read.next();
        persona.setNombre(nombre);
        
        System.out.println("Ingresar su edad: ");
        int edad = read.nextInt();
        persona.setEdad(edad);
        
        String sexo;
        boolean valido = false;
        do {
            System.out.println("Ingresar su sexo: H(hombre), M(mujer) u O(otro) ");
            sexo = read.next();
            sexo = sexo.toUpperCase();
            if (sexo.equals("M") || sexo.equals("H") || sexo.equals("O")){
                valido = true;
                persona.setSexo(sexo);
            }
        } while (!valido);
        
        
        System.out.println("Ingresar su peso: ");
        double peso = read.nextDouble();
        persona.setPeso(peso);
        
        System.out.println("Ingresar su altura: ");
        double altura = read.nextDouble();
        persona.setAltura(altura);
        
        return persona;
    }
    
    public int calcularIMC(Persona persona){
        double peso = persona.getPeso();
        double altura = persona.getAltura()/100;
        double imc = peso/(altura*altura);
        int resultado;
        
        if (imc < 18.5) {
        resultado = -1; // Debajo del peso ideal
        } else if (imc >= 18.5 && imc <= 24.9) {
        resultado = 0; // Peso ideal
        } else {
        resultado = 1; // Sobrepeso
        }
        return resultado;
    }
    
    
    public boolean esMayorDeEdad(Persona persona){
        return persona.getEdad()>= 18;
    }
}
