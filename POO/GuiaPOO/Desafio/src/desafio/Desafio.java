

package desafio;
import Servicios.ServicioRutina;
import java.util.Scanner;
import Servicios.ServicioCliente;
public class Desafio {

    public static void main(String[] args) {
       
       Scanner read = new Scanner(System.in).useDelimiter("\n");
       
       ServicioCliente cs = new ServicioCliente();
       ServicioRutina rs = new ServicioRutina();
       boolean salir = true;
       while (salir){
            System.out.println("Ingresar el valor del menu deseado:");
            System.out.println("------------------------------");
            System.out.println("1.Registrar cliente");
            System.out.println("2. Obtener clientes");
            System.out.println("3. Actualizar clientes");
            System.out.println("4. Eliminar cliente");
            System.out.println("5. Crear rutina");
            System.out.println("6. Obtener rutinas");
            System.out.println("7. Actualizar rutina");
            System.out.println("8. Eliminar Rutina");
            System.out.println("9. Salir");
            int menu = read.nextInt();
            
            switch (menu){
                case 1: 
                    cs.registrarCliente();
                    break;
                case 2: 
                    cs.obtenerClientes();
                    break;
                case 3: 
                    System.out.println("Ingresa el id del cliente que quieres modificar");
                    int id = read.nextInt();
                    System.out.println("Ingresa el nuevo Nombre");
                    String nombre = read.next();
                    System.out.println("Ingresa la nueva edad");
                    int edad = read.nextInt();
                    System.out.println("Ingresa la nueva altura");
                    double altura = read.nextDouble();
                    System.out.println("Ingresa la nueva peso");
                    double peso = read.nextDouble();
                    System.out.println("Ingresa la nueva objetivo");
                    String objetivo = read.next();
                    cs.actualizarCliente(id, nombre, edad, altura, peso, objetivo);
                    break;
                case 4: 
                    System.out.println("Ingresar id de cliente a eliminar: ");
                    id = read.nextInt();
                    cs.eliminarCliente(id);
                case 5: 
                    rs.registrarRutina();
                    break;
                case 6: 
                    rs.obtenerRutina();
                    break;
                case 7: 
                    System.out.println("Ingresa el id de la rutina que quieres modificar");
                    id = read.nextInt();

                    System.out.println("Ingresa el nuevo Nombre");
                    nombre = read.next();

                    System.out.println("Ingresa la nueva duracion");
                    int duracion = read.nextInt();

                    System.out.println("Ingresa el nuevo nivel de Dificultad");
                    int nivelDificultad = read.nextInt();

                    System.out.println("Ingresa la nueva descripcion");
                    String descripcion = read.next();

                    rs.actualizarRutina(id, nombre, duracion, nivelDificultad, descripcion);

                    break;
                case 8: 
                    System.out.println("Ingresa el id de la rutina que deseas eliminar");
                    id = read.nextInt();
                    rs.eliminarRutina(id);
                    break;
                    
                case 9: 
                    System.out.println("Saliendo.....");
                    salir = false;
                default: 
                    System.out.println("Ingresar un valor válido.");
                    break;
            
            }
       }
       
       
       
    }

}
