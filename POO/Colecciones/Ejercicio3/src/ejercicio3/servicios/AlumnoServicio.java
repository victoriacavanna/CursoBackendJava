package ejercicio3.servicios;

import ejercicio3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void cargarAlumnos(ArrayList<Alumno> listaAlumnos) {
        String opcion;
        do {
            listaAlumnos.add(cargarAlumno());
            System.out.println("¿Desea seguir cargando alumnos? (S/N)");
            opcion = read.next();
        } while (!opcion.equalsIgnoreCase("n") && !opcion.equalsIgnoreCase("no"));
    }

    public Alumno cargarAlumno() {
        ArrayList<Integer> notas = new ArrayList();

        System.out.println("Ingresar nombre de alumno: ");
        String nombre = read.next();
        System.out.println("Ingresar nota n°1: ");
        int nota1 = read.nextInt();
        notas.add(nota1);
        
        System.out.println("Ingresar nota n°2: ");
        int nota2 = read.nextInt();
        notas.add(nota2);

        System.out.println("Ingresar nota n°3: ");
        int nota3 = read.nextInt();
        notas.add(nota3);
        
        return new Alumno(nombre, notas);
    }
    
     
    public double notaFinal(ArrayList<Integer> notas){
        double promedio = 0;
        for (int nota : notas){
            promedio += nota;
        }
        return (promedio / 3);
    }
}
