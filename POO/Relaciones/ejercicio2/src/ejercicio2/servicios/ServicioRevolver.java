package ejercicio2.servicios;

import ejercicio2.entidades.RevolverDeAgua;
import java.util.Random;

public class ServicioRevolver {

    private RevolverDeAgua revolver = new RevolverDeAgua();
    private Random random = new Random();

    public RevolverDeAgua llenarRevolver() {
        revolver.setPosicionActual(random.nextInt(6));
        revolver.setPosicionAgua(random.nextInt(6));
        return revolver;
    }

    public boolean mojar() {
        boolean resultado = revolver.getPosicionAgua() == revolver.getPosicionActual();
        if (resultado) {
            System.out.println("Perdiste!");
        } else {
            System.out.println("Zafaste!");
        }
        return resultado;
    }

    public void siguienteChorro() {
        int posicion = revolver.getPosicionActual();
        if (posicion < 6) {
            posicion += 1;
        } else {
            posicion = 1;
        }
        revolver.setPosicionActual(posicion);
    }

    public String obtenerInfoRevolver() {
        return revolver.toString();
    }
}

