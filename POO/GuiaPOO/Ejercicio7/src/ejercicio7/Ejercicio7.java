

package ejercicio7;

import Entidades.Persona;
import Servicios.PersonaService;


public class Ejercicio7 {

    public static void main(String[] args) {
        PersonaService personaService = new PersonaService();
        
        Persona persona1 = personaService.crearPersona();
        System.out.println("-----------------------------");
        Persona persona2 = personaService.crearPersona();
        System.out.println("-----------------------------");
        Persona persona3 = personaService.crearPersona();
        System.out.println("-----------------------------");
        Persona persona4 = personaService.crearPersona();
        System.out.println("-----------------------------");
        
        informeIMC(persona1);
        informeIMC(persona2);
        informeIMC(persona3);
        informeIMC(persona4);
   
        
        informarMayor(persona1);
        informarMayor(persona2);
        informarMayor(persona3);
        informarMayor(persona4);


    }
    public static void informeIMC(Persona persona){
        PersonaService personaService = new PersonaService();
        switch (personaService.calcularIMC(persona)) {
            case 0:
                System.out.println(persona.getNombre() + ": Peso ideal");
                break;
            case -1:
                System.out.println(persona.getNombre() + ": Debajo de peso ideal");
                break;
            default:
                System.out.println(persona.getNombre() + ": Sobrepeso");
                break;
        }
    }
    public static void informarMayor(Persona persona){
        PersonaService personaService = new PersonaService();
        if (personaService.esMayorDeEdad(persona)){
            System.out.println(persona.getNombre() + ": es mayor de edad");
        } else {
            System.out.println(persona.getNombre() + ": es menor de edad");
        }
    }
}
