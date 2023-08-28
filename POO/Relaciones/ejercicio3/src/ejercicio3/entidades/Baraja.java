
package ejercicio3.entidades;

import java.util.ArrayList;

public class Baraja {
    private ArrayList<Carta> mazo;
    private int cartasDisponibles;

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> mazo, int cartasDisponibles) {
        this.mazo = mazo;
        this.cartasDisponibles = cartasDisponibles;
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    public int getCartasDisponibles() {
        return cartasDisponibles;
    }

    public void setCartasDisponibles(int cartasDisponibles) {
        this.cartasDisponibles = cartasDisponibles;
    }

    @Override
    public String toString() {
        return "Baraja{" + "mazo=" + mazo + ", cartasDisponibles=" + cartasDisponibles + '}';
    }
    
    
}
