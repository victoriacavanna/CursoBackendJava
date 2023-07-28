
package ejercicio2.servicios;

import ejercicio2.entidades.Perro;
import ejercicio2.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PerroServicio {
    Scanner read;
    List<Perro> perros;
    
    public PerroServicio() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.perros = new ArrayList<>();
    }

    public void agregarPerro() {
        System.out.println("Ingresar nombre del perro: ");
        String nombre = read.next();

        System.out.println("Ingresar raza del perro: ");
        String raza = read.next();

        Perro perroAgregado = new Perro(nombre, raza);

        try {
            perros.add(perroAgregado);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al agregar el perro.");
            System.out.println("Detalles del error: " + e.getMessage());
        }
    }

    public void mostrarPerros() {
        Iterator<Perro> it = perros.iterator();

        System.out.println("Lista de perros:");
//        for (Perro perro : perros) {
//            System.out.println(perro);
//        }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Cantidad de perros: " + perros.size());
    }

    public void buscarPerro(Perro p) {
        Iterator<Perro> it = perros.iterator();
        boolean encontrado = false;
        
        while (it.hasNext()) {
            Perro perroActual = it.next();
            if (perroActual.getNombre().equalsIgnoreCase(p.getNombre())) {
                perros.remove(p);
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Se eliminó con éxito");
        } else {
            System.out.println("No se encontró el perro en la lista");
        }
        mostrarPerrosOrdenadosPorNombreDesc();
    }

    public void mostrarPerrosOrdenadosPorNombreDesc() {
 
        Collections.sort(perros, Comparadores.ordenarPorNombreDesc);

        System.out.println("Lista de perros ordenados por nombre (descendente):");
        for (Perro perro : perros) {
            System.out.println(perro);
        }
        System.out.println("Cantidad de perros: " + perros.size());
    }
}

