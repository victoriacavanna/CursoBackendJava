package mascotaapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import mascotaapp.entidades.Mascota;
import mascotaapp.servicios.ServicioMascota;
import mascotaapp.utilidades.Comparadores;

public class MascotaApp {

    public static void main(String[] args) {
        
        
        
        HashMap <String, Mascota> mascotas = new HashMap();
        
        //Ordena keys de manera ascendente
        mascotas.put("2", new Mascota("Arya", "Chiquita", "Perro"));
        mascotas.put("1", new Mascota("Nala", "Chiquita", "Perro"));
        
        mascotas.remove("1",new Mascota("Nala", "Chiquita", "Perro"));
        
        //Remover por key
        mascotas.remove("2");
        for (Map.Entry<String, Mascota> aux : mascotas.entrySet()) {
            String key = aux.getKey();
            Mascota value = aux.getValue();
            
            System.out.println("Key:" + key + " | Value:" + value );
            
        }

    }

}
