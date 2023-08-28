package ejercicio2;

import ejercicio2.servicios.ServicioJuego;

public class Ejercicio2 {

    public static void main(String[] args) {
        ServicioJuego sjuego = new ServicioJuego();
        System.out.println("---Juego de la ruleta ---");

        sjuego.crearPartida();
        sjuego.ronda();
    }

}
