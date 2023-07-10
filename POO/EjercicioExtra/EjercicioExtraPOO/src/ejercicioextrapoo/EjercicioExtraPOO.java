

package ejercicioextrapoo;
import Entidades.Vehiculo;

public class EjercicioExtraPOO {

    public static void main(String[] args) {
       
        Vehiculo v1 = new Vehiculo("renault", "polo", 2010, "automovil");
        v1.moverse(5);
        v1.moverse(10);
        v1.moverse(60);
        
        Vehiculo v2 = new Vehiculo("montainbike", "carrera", 2013, "bicicleta");
        v2.moverse(5);
        v2.moverse(10);
        v2.moverse(60);
        
        Vehiculo v3 = new Vehiculo("honda", "460", 2021, "motocicleta");
        v3.moverse(5);
        v3.moverse(10);
        v3.moverse(60);
        
        
        
        
        
    }

}
