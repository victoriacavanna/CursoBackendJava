
package Servicios;
import Entidades.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioCliente {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList<Cliente> clientes = new ArrayList<>();
    
    public Cliente crearCliente(){
        System.out.println("Ingresar id: ");
        int id = read.nextInt();
        System.out.println("Ingresar nombre: ");
        String nombre = read.next();
        System.out.println("Ingresar edad: ");
        int edad = read.nextInt();
        System.out.println("Ingresar altura: ");
        double altura = read.nextDouble();
        System.out.println("Ingresar peso: ");
        double peso = read.nextDouble();
        System.out.println("Ingresar objetivo: ");
        String objetivo = read.next();
        
        return new Cliente(id, nombre, edad, altura, peso, objetivo);
    }
    
    public void registrarCliente(){
        clientes.add(crearCliente());
    }
    
    public void obtenerClientes(){
        clientes.forEach((list) -> {
            System.out.println(list);
        });
    }
    public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo){
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == id) {
                clientes.get(i).setNombre(nombre);
                clientes.get(i).setEdad(edad);
                clientes.get(i).setAltura(altura);
                clientes.get(i).setPeso(peso);
                clientes.get(i).setObjetivo(objetivo);
            }
        }

        //mostrar nuevo cliente
        System.out.println("Los nuevos datos del cliente son: ");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i));
        }

    }
    public void eliminarCliente(int id){
        for (int i = 0; i < clientes.size(); i++){
            if (clientes.get(i).getId() == id){
                clientes.remove(i);
            }
        }
    }
    
    
}
