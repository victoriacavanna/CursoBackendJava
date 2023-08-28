package ejercicio3.servicios;

import ejercicio3.entidades.Baraja;
import ejercicio3.entidades.Carta;
import ejercicio3.enums.Palo;
import java.util.ArrayList;

public class BarajaService {

    Baraja baraja = new Baraja();
    ArrayList<Carta> cartaMonton = new ArrayList();

    public void crearBaraja() {
        ArrayList<Carta> cartasMazo = new ArrayList();
        for (Palo aux : Palo.values()) {
            for (int i = 1; i <= 12; i++) {
                if (i != 9 && i != 8) {
                    Carta carta = new Carta(i, aux);
                    cartasMazo.add(carta);
                }
            }
        }

        baraja.setMazo(cartasMazo);
    }

    public void mostrarDisponibles() {
        System.out.println("---Cartas disponibles: ---");
        for (Carta aux : baraja.getMazo()) {
            System.out.println(aux.toString());
        }
    }

    public void barajar() {
        ArrayList<Carta> cartas = baraja.getMazo();

        for (int i = 0; i < cartas.size(); i++) {
            //Creo posicion aleatoria
            int posicion = (int) (Math.random() * cartas.size());
            //obtengo la carta temporal actual
            Carta temp = cartas.get(i);
            //A la carta actual le cambio el valor por la q esta en la posicion
            cartas.set(i, cartas.get(posicion));
            // a la carta de la posicion le asigno el valor de la carta actual
            cartas.set(posicion, temp);
        }
    }

    public int cantidadCartasDisponibles() {
        return baraja.getMazo().size();
    }

    public void siguienteCarta() {
        ArrayList<Carta> cartas = baraja.getMazo();

        if (!cartas.isEmpty()) {
            
            System.out.println("Siguiente Carta: " + cartas.get(1));
            cartaMonton.add(cartas.get(0));
            cartas.remove(0);
            
        } else {
            System.out.println("No hay más cartas");

        }
    }

    public void darCartas(int cantidad) {
        ArrayList<Carta> cartas = baraja.getMazo();

        if (cartas.size() > cantidad) {
            for (int i = 0; i < cantidad; i++) {
                siguienteCarta();
            }
        } else {
            System.out.println("No hay suficientes cartas para dar esa cantidad.");
            System.out.println("Cantidad disponible: " + cantidadCartasDisponibles());
        }
    }

    public void cartasMonton() {
        System.out.println("---Cartas que ya salieron: --- ");
        if (!cartaMonton.isEmpty()) {
            for (Carta aux : cartaMonton) {
                System.out.println(aux.toString());
            }
        } else {
            System.out.println("Todavía no salió ninguna carta");
        }
    }

    public void mostrarBaraja() {
        ArrayList<Carta> cartas = baraja.getMazo();

        System.out.println("--Toda la baraja: --");
        for (Carta aux : cartas) {
            System.out.println(aux.toString());
        }
    }

    public void cartaActual() {
        ArrayList<Carta> cartas = baraja.getMazo();
        System.out.println("Carta Actual: " + cartas.get(0));
    }
}
