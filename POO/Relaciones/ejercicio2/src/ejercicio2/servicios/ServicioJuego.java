package ejercicio2.servicios;

import ejercicio2.entidades.Juego;
import ejercicio2.entidades.Jugador;
import ejercicio2.entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioJuego {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Juego juego = new Juego();
    Jugador j = new Jugador();
    ServicioJugador js = new ServicioJugador();
    ServicioRevolver sr = new ServicioRevolver();
    ArrayList<Jugador> jugadores = new ArrayList<>();

    public void crearPartida() {
        int cantidad;
        System.out.println("Ingrese la cantidad de participantes (1 a 6): ");
        cantidad = read.nextInt();
        if (cantidad > 6 || cantidad < 1) {
            cantidad = 6;
        }

        for (int i = 0; i < cantidad; i++) {
            Jugador jug = new Jugador();
            jug.setId(i + 1);
            jug.setNombre("Jugador " + jug.getId());
            jugadores.add(jug);
        }
        System.out.println("Se creó la partida con " + cantidad + " jugadores");

        RevolverDeAgua revolver = sr.llenarRevolver();
        int posicionAgua = revolver.getPosicionAgua();
        System.out.println("La posición del revolver es: " + sr.obtenerInfoRevolver());
        llenarJuego(revolver, posicionAgua);
    }

    public void llenarJuego(RevolverDeAgua r, int posicionAgua) {
        juego.setJugadores(jugadores);
        juego.setRevolver(r);
        r.setPosicionAgua(posicionAgua);
        System.out.println("Se llenó el juego.");
    }

    public void ronda() {
        boolean juegoTerminado = false;
    for (Jugador jugador : juego.getJugadores()) {
        if (!juegoTerminado) {
            System.out.println("Es el turno de " + jugador.getNombre());

            if (js.disparo(jugador, sr)) {
                System.out.println("Se terminó el juego! Perdió " + jugador.getNombre());
                juegoTerminado = true;
            } else {
                System.out.println("Siguiente turno");
            }
        }
    }
}
}
