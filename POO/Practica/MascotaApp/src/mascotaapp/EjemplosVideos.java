
package mascotaapp;

import java.util.ArrayList;
import java.util.List;
import mascotaapp.servicios.ServicioMascota;

public class EjemplosVideos {
        /*Scanner read = new Scanner(System.in);
        Mascota m1 = new Mascota();
        System.out.println("Ingresar datos de mascota: ");
        System.out.println("Nombre: ");
        m1.nombre = read.next();
        System.out.println("Apodo: ");
        m1.apodo = read.next();
        System.out.println("Tiene cola: ");
        m1.cola = read.nextBoolean();
        System.out.println("Tipo animal: ");
        m1.tipo = read.next();
        System.out.println("Raza: ");
        m1.raza = read.next();
        System.out.println("Edad: ");
        m1.edad = read.nextInt();
        System.out.println("Color: ");
        m1.color = read.next();

        System.out.println("Tipo mascota: " + m1.tipo);
        System.out.println("Nombre mascota: " + m1.nombre);
        System.out.println("Apodo mascota: " + m1.apodo);
        System.out.println("Edad mascota: " + m1.edad);
        System.out.println("Color mascota: " + m1.color);
        System.out.println("Raza mascota: " + m1.raza);
        System.out.println("Tienen cola mascota: " + m1.cola);*/
        
        //Arrays -> dimensión estática 
        /*String[] mascotasArray = new String[5];
    
        for (int i = 0; i < mascotasArray.length; i++){
        mascotasArray[i] = "Chiquito " + i + 1;
        }
        
        for (String nombre : mascotasArray){
            System.out.println(nombre);
        }
        
        System.out.println("----------------");
        
        //Collections -> empieza con dimensión 0, dimensión dinámica
        ArrayList<String> mascotasArrayList = new ArrayList();
        mascotasArrayList.add("Chiquito");
        mascotasArrayList.add("Chiquito");
        mascotasArrayList.add("Chiquito");
        System.out.println("Tamaño de mascotasArrayList:" + mascotasArrayList.size());
        mascotasArrayList.remove("Chiquito");
        System.out.println("Tamaño de mascotasArrayList tras remover un elemento:" + mascotasArrayList.size());
    
        //Int ArrayList 
        ArrayList<Integer> mascotasArrayListInt = new ArrayList();
        
        mascotasArrayListInt.add(1);
        mascotasArrayListInt.add(2);
        mascotasArrayListInt.add(3);
        mascotasArrayListInt.add(4);
        mascotasArrayListInt.add(5);
        System.out.println("Mostrar ArrayList completo: ");
        for (Integer num : mascotasArrayListInt){
            System.out.println(num);
        }
        System.out.println("----Eliminar por indice posición 2 (num 3) ---");
        mascotasArrayListInt.remove(2);
        for (Integer num : mascotasArrayListInt){
            System.out.println(num);
        }
        System.out.println("----Eliminar por objeto valor 3 (posición 2) ---");
        Integer y = 3;
        mascotasArrayListInt.remove(y);
        for (Integer num : mascotasArrayListInt){
            System.out.println(num);
        }
        
        /**
         * Video 3:
        
        ServicioMascota ms = new ServicioMascota();
        ms.crearMascota();
        ms.crearMascota();
        
        ms.mostrarMascotas();*/
        
        
//        ServicioMascota ms = new ServicioMascota();
//        System.out.println("-----Administrar lista de mascotas ------");
//        ms.fabricaMascotas(2);
//        
//        ms.mostrarMascotas();
//        
//        
//        ms.actualizarMascota(0);
//        
//        ms.mostrarMascotas();
//        
//        
//        ms.eliminarMascota(0);
//        
//        ms.mostrarMascotas();

//
//        String [] nombres = {"Harry", "Louis"};
//        List <String> nombresList = new ArrayList(Arrays.asList(nombres));
//        
//        List <String> nombresList2 = new ArrayList();
//        nombresList2.addAll(nombresList);
        

/**
 * Video 5:
        List <String> nombres = new ArrayList();
        nombres.add("Harry");
        nombres.add("Louis");
        nombres.add("Taylor");
        
        //Maneras de recorrer
        
        /*for (String nombre:nombres){
            System.out.println(nombre);
        } -> Buena para mostrar o actualizar, no se puede eliminar */
        
        
        /*nombres.stream().count();*/
        
        
        /*for (int i = 0; i < nombres.size(); i++){
                        
            String n = nombres.get(i);
            if(n.equals("Taylor")){
                nombres.remove(n);
            }
        }
        
        for (int i = 0; i < nombres.size(); i++){
            System.out.println(nombres.get(i));
        } -> Para tener mejor control
        
        
        Iterator<String> it = nombres.iterator();
        
        while (it.hasNext()){
            String aux = it.next();
            System.out.println(aux);
            if (aux.equals("Taylor")){
                it.remove();
            }
        }
        
        nombres.forEach((e)-> System.out.println(e));
        ServicioMascota ms = new ServicioMascota();
        System.out.println("-----Administrar lista de mascotas ------");
        ms.fabricaMascotas(2);

        ms.mostrarMascotas();

        ms.actualizarMascota(0);

        ms.mostrarMascotas();

        ms.eliminarMascota(0);

        Aryams.mostrarMascotas();
        
        ms.eliminarMascotaPorNombre("Nala");
        ms.mostrarMascotas();
        
        ms.actualizarMascotaPorNombre("Nala", "Nalita");
        ms.mostrarMascotas();*/
    /**
     * VIDEO 6:
     * ArrayList<Mascota> mascotas = new ArrayList();
        
        mascotas.add(new Mascota("Arya", "Perrita", "Perro"));
        mascotas.add(new Mascota("Nala", "Chiquita", "Perro"));
        mascotas.add(new Mascota("Arya", "Perrita", "Perro"));
        mascotas.add(new Mascota("Arya", "Perrita", "Perro"));
        mascotas.add(new Mascota("Nala", "Chiquita", "Perro"));
        mascotas.add(new Mascota("Nala", "Chiquita", "Perro"));
        Collections.sort(mascotas, Comparadores.ordenarPorNombreDesc);
        
        for (Mascota aux: mascotas){
            System.out.println(aux);
        }
        System.out.println("----------------");
        Collections.shuffle(mascotas);
        for (Mascota aux: mascotas){
            System.out.println(aux);
        }
     */
    /**
     * VIDEO 7: 
     */
    //  Sets -> no existen duplicados
//        Set<String> nombres = new HashSet();
//        nombres.add("Nala");
//        nombres.add("Nala");
//        nombres.add("Nala");
//        for (String nombre : nombres){
//            System.out.println(nombre);
//        }
//        
//        //TreeSet -> tiene la naturaleza de ordenar cosas
//        TreeSet<Mascota> mascotas = new TreeSet();
//        
//        mascotas.add(new Mascota("Arya", "Perrita", "Perro"));
//        mascotas.add(new Mascota("Nala", "Chiquita", "Perro"));
//        mascotas.add(new Mascota("Arya", "Perrita", "Perro"));
//        mascotas.add(new Mascota("Arya", "Perrita", "Perro"));
//        mascotas.add(new Mascota("Nala", "Chiquita", "Perro"));
//        mascotas.add(new Mascota("Nala", "Chiquita", "Perro"));
//        
//        for (Mascota aux: mascotas){
//            System.out.println(aux);
//        }
//        
//        HashMap<Integer, String> personas = new HashMap();
//        String n1 = "Albus";
//        String n2 = "Severus";
//        personas.put(1,n1);
//        personas.put(2,n2);
    
    /**
     * VIDEO 8:
     
    HashMap <Integer, String> nombres = new HashMap();
        nombres.put(1, "Nala");
        nombres.put(2, "Nala");
        
        for (Map.Entry<Integer, String> aux : nombres.entrySet()) {
            Integer key = aux.getKey();
            String value = aux.getValue();
            
            System.out.println("Key:" + key + " | Value:" + value );
            
        }*/
}
