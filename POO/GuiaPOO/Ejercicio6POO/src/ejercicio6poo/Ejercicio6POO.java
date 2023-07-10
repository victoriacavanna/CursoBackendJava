

package ejercicio6poo;

import Entidades.Cafetera;
import Servicios.CafeteraService;



public class Ejercicio6POO {

    public static void main(String[] args) {
       double cantidad;
        CafeteraService cafeteraService = new CafeteraService();
       
       Cafetera cafetera = new Cafetera(1000, 0);
       cafeteraService.llenarCafetera(cafetera);
      cantidad = cafetera.getCantidadActual();
       System.out.println(cantidad);
       
       cafeteraService.servirTaza(500, cafetera);
       cantidad = cafetera.getCantidadActual();
       System.out.println(cantidad);
    }

}
