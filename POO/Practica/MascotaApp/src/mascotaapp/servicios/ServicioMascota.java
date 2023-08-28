
package mascotaapp.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mascotaapp.entidades.Mascota;


public class ServicioMascota {
    private Scanner read;
    private List<Mascota> mascotas;  

    public ServicioMascota() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList() ;
    }
    
    public Mascota crearMascota(){
        System.out.println("Ingresar nombre: ");
        String nombre = read.next();
        
        System.out.println("Ingresar apodo: ");
        String apodo = read.next();
        
        System.out.println("Ingresar tipo: ");
        String tipo = read.next();
        
        /*Mascota m =  new Mascota(nombre,apodo, tipo);
        mascotas.add(m);*/
        return new Mascota(nombre,apodo, tipo);
    }
    
    public void creandoMascota(){
        Mascota m = new Mascota();
        System.out.println("Ingresar nombre: ");
        String nombre = read.next();
        m.setNombre(nombre);
        
        System.out.println("Ingresar apodo: ");
        String apodo = read.next();
        m.setApodo(apodo);
        
        System.out.println("Ingresar tipo: ");
        String tipo = read.next();
        m.setTipo(tipo);
        
        mascotas.add(m);
    }
    
    public void agregarMascota(Mascota m){
        mascotas.add(m);
    }
    
    public void mostrarMascotas(){
        System.out.println("Las mascotas actuales de la Lista Mascotas son: ");
        for (Mascota aux : mascotas){
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad total: " + mascotas.size());
    }
    
    /**
     * Crea mascotas, todos iguales -> perrita
     * @param cantidad equivale a la cantidad de mascotas a crear y añadir a la lista
     * 
     */
    public void fabricaPerritas(int cantidad){
        for (int i = 0; i < cantidad; i ++){
            mascotas.add(new Mascota("Nala", "Perrita", "Beagle"));
        }
    }

    
    /**
     * Crea mascotas pidiendo datos por teclado
     * @param cantidad 
     * 
     */

    public void fabricaMascotas(int cantidad){
        for (int i = 0; i < cantidad; i++){
            Mascota m = crearMascota();
            agregarMascota(m);
            System.out.println(m.toString());
        }

    }
    
    //TODO añadir Try and Catch
    /*public void actualizarMascota(int index){
        Mascota m = mascotas.get(index);
        m.setApodo("Pequeño");
    }*/
    
    /**
     * 
     * @param index indice de objeto a cambiar: se crea otro objeto y se pisa el del indice establecido
     */
    public void actualizarMascota(int index){
        if (index <= mascotas.size()-1){
            System.out.println(" ");
            System.out.println("-------Actualizar-----");
        
            Mascota m = crearMascota();
        
            mascotas.set(index, m);
        } else {
            System.out.println("");
            System.out.println("Error al actualizar. Indice inválido");
        }
    }
    /**
     * 
     * @param nombre -> actualizar mascota por nombre
     */
    public void actualizarMascotaPorNombre(String nombreViejo, String nombreNuevo){
        
        for(int i = 0; i < mascotas.size(); i++){
            
            Mascota m = mascotas.get(i);
            
            if (m.getNombre().equals(nombreViejo)){
                m.setNombre(nombreNuevo);
            }
        }
    }
    
    /**
     * 
     * @param index eliminar mascota por indice
     */
    public void eliminarMascota(int index){
        if (index <= mascotas.size()-1){
            System.out.println("");
            System.out.println("-------Eliminar-----");
        
            mascotas.remove(index);
        } else {
            System.out.println("");
            System.out.println("Error al eliminar. Indice inválido");
        }  
    }
    
    /**
     * 
     * @param nombre -> eliminar mascota por nombre
     */
    public void eliminarMascotaPorNombre(String nombre){
        
        for(int i = 0; i < mascotas.size(); i++){
            Mascota m = mascotas.get(i);
            if (m.getNombre().equals(nombre)){
                mascotas.remove(i);
            }
        }
        
    }
    
}