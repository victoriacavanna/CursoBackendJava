

package ejercicio3;

import ejercicio3.entidades.Alumno;
import ejercicio3.servicios.AlumnoServicio;
import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        AlumnoServicio as = new AlumnoServicio();
        ArrayList<Alumno> listaAlumnos = new ArrayList();
        double promedio = 0;
        boolean encontrado = false;
        
        
        System.out.println("----Cargar alumnos---");
        as.cargarAlumnos(listaAlumnos);
        
        System.out.println("--Mostrar la nota promedio");
        System.out.println("Nombre del alumno: ");
        String nombre = read.next();
        
        for (int i = 0; i < listaAlumnos.size(); i++){
            Alumno a = listaAlumnos.get(i);
            if (a.getNombre().equals(nombre)){
                promedio = as.notaFinal(a.getNotas());
                encontrado = true;
            }
        }
        if (encontrado){
            System.out.println("La nota final del alumno " + nombre + " es " + promedio);
        }else {
            System.out.println("No se encontró el alumno en la lista.");
        }
    }

}
