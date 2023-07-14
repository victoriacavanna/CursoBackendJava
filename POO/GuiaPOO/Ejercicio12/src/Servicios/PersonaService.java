
package Servicios;

import Entidades.Persona;
import java.util.Scanner;
import java.time.LocalDate;


public class PersonaService {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Persona persona = new Persona();
    
    public Persona crearPersona(){
        System.out.println("Ingresar nombre: ");
        String nombre = read.next();
        persona.setNombre(nombre);
        System.out.println("Ingresar fecha de nacimiento (formato: yyyy-MM-dd): ");
        String fechaNacimientoStr = read.next();
        
        // Convertir la cadena de fecha a LocalDate
        LocalDate nacimiento = LocalDate.parse(fechaNacimientoStr);
        persona.setNacimiento(nacimiento);
        
        return persona;
    }
    
    public int calcularEdad() {
        int anios;
        LocalDate anioActual = LocalDate.now();
        anios = anioActual.compareTo(persona.getNacimiento());
        return anios;
    }
    
    public boolean menorQue(int edad){
        return edad > calcularEdad();
    }
    public void mostrarPersona(){
        System.out.println("La persona " + persona.getNombre() + " nació " + persona.getNacimiento());
    }
}
