
package ejercicio1.servicios;

import ejercicio1.entidades.Perro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerroServicio {
    
    Scanner read;
    //ArrayList<Perro> perros;
    List<String> razas;
    
    public PerroServicio() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.razas = new ArrayList() ;
    }
    
    
    public void agregarPerro(){
        System.out.println("Ingresar raza del perro: ");
        String raza = read.next();
        try {
            razas.add(raza);
        } catch (Exception e){
            System.out.println("Ha ocurrido un error al agregar la raza del perro.");
            System.out.println("Detalles del error: " + e.getMessage());
            
        }
        //Perro perroAgregado = new Perro(raza);
        //perros.add(perroAgregado);
        //return perroAgregado;
    }
    
    public void mostrarPerros(){
        for (String aux : razas){
            System.out.println("Raza: " + aux);
        }
        System.out.println("Cantidad de perros:" + razas.size());
    }
}
