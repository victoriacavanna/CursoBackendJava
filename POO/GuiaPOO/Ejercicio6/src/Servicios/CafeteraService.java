
package Servicios;
import Entidades.Cafetera;

public class CafeteraService {
    public void llenarCafetera(Cafetera cafetera){
        double capacidadMax = cafetera.getCapacidadMaxima();
        cafetera.setCantidadActual(capacidadMax);
    }
    
    public void servirTaza(int tamanio, Cafetera cafetera){
        double cantidadAct = cafetera.getCantidadActual();
        if (cantidadAct >= tamanio){
            cantidadAct -= tamanio;
            System.out.println("Se llenó la taza");
        } else {
            double servido = cantidadAct;
            cantidadAct = 0;
            System.out.println("No se pudo llenar la taza. Se sirvió " + servido + "ml");
        }
        cafetera.setCantidadActual(cantidadAct);
    }
    
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
    }
    
    public void agregarCafe(double cantidad, Cafetera cafetera){
        double cantidadAct = cafetera.getCantidadActual();
        double capacidadMax = cafetera.getCapacidadMaxima();
        if (cantidadAct + cantidad <= capacidadMax){
            cantidadAct += cantidad;
            System.out.println("Se agregaron "+ cantidad + "ml de café"); 
        }else {
            double excedente = (cantidadAct + cantidad) - capacidadMax;
            cantidadAct = capacidadMax;
        }
        cafetera.setCantidadActual(cantidadAct);
    }
}
