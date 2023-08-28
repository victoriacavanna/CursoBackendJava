package ejercicio2.servicios;

import ejercicio2.entidades.Jugador;
public class ServicioJugador {

    public boolean disparo(Jugador j, ServicioRevolver sr) {
        if (sr.mojar()) {
            j.setMojado(true);
            return true;
        }
        sr.siguienteChorro();
        return false;
    }
}
