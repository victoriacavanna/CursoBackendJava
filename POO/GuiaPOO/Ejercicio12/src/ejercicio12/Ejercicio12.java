

package ejercicio12;
import Entidades.Persona;
import Servicios.PersonaService;

public class Ejercicio12 {

    public static void main(String[] args) {
    PersonaService ps = new PersonaService();

    Persona persona = ps.crearPersona();
    
    System.out.println(persona.getNombre()+ " tiene " + ps.calcularEdad() + " años");
    
    int edad = 18;
    if (ps.menorQue(edad)){
        System.out.println(persona.getNombre() + " tiene menos de "+ edad + " años");
    } else {
        System.out.println(persona.getNombre() + " tiene más de "+ edad + " años");
    }
    
    
    ps.mostrarPersona();
    
    }
}
