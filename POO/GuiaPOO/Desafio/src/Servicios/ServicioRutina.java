
package Servicios;
import java.util.Scanner;
import Entidades.Rutina;
import java.util.ArrayList;

public class ServicioRutina {
     ArrayList<Rutina> clientes = new ArrayList<>();
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    private Rutina crearRutina() {
        System.out.println("Ingresa el id de la rutina");
        int id = read.nextInt();
        System.out.println("Ingresa el nombre de la rutina");
        String nombre = read.next();
        System.out.println("Ingresa el duracion de la rutina");
        int duracion = read.nextInt();
        System.out.println("Ingresa el nivel de Dificultad de la rutina");
        int nivelDificultad = read.nextInt();
        System.out.println("Ingresa la descripcion de la rutina");
        String descripcion = read.next();

        return new Rutina(id, nombre, duracion, nivelDificultad, descripcion);
    }

    public void registrarRutina() {

        clientes.add(crearRutina());
    }

    public void obtenerRutina() {

        if (clientes.isEmpty()) {
            System.out.println("No hay Rutinas en la clientes");
        } else {
            clientes.forEach((list) -> {
                System.out.println(list);
            });
        }

    }

    public void actualizarRutina(int id, String nombre, int duracion, int nivelDificultad, String descripcion) {

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == id) {
                clientes.get(i).setNombre(nombre);
                clientes.get(i).setDuracion(duracion);
                clientes.get(i).setDescripcion(descripcion);
                clientes.get(i).setNivelDificultad(nivelDificultad);
            }
        }

        //mostrar nueva rutina 
        System.out.println("Los nuevos datos de la rutina son: ");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i));
        }
    }

    public void eliminarRutina(int id) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == id) {
                clientes.remove(i);
            }
        }
        System.out.println("La rutina ha sido eliminada con exito");
    }
}
