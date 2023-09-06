
package ejercicio1.entidades;


public class Gato extends Animal {
    
    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override 
    public void Alimentarse(){
        System.out.println("El gato " + getNombre() +" se alimenta de " + getAlimento());
    }
}
