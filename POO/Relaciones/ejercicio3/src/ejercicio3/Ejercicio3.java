package ejercicio3;

import ejercicio3.entidades.Baraja;
import ejercicio3.servicios.BarajaService;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        BarajaService bs = new BarajaService();
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        int opcion;
        bs.crearBaraja();

        do {
            System.out.println("--- MENÚ ---");
            System.out.println("1. Barajar: mezcla las cartas");
            System.out.println("2. Siguiente carta: muestra la siguiente");
            System.out.println("3. Cartas disponibles: indica número de cartas que aún se pueden repartir");
            System.out.println("4. Dar cartas: repartir una cantidad de cartas");
            System.out.println("5. Montón de cartas: muestra cartas que ya salieron");
            System.out.println("6. Mostrar baraja: muestra todas las cartas disponibles hasta el final");
            System.out.println("7. Carta actual: indica cual es la carta actual");
            System.out.println("8. Salir");
            System.out.println("Ingresar opción: ");
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    bs.barajar();
                    break;
                case 2:
                    bs.siguienteCarta();
                    break;
                case 3:
                    System.out.println("Candidad disponible: " + bs.cantidadCartasDisponibles());
                    break;
                case 4:
                    System.out.println("Ingresar cantidad a repartir: ");
                    int cantidad = read.nextInt();
                    bs.darCartas(cantidad);
                    break;
                case 5:
                    bs.cartasMonton();
                    break;
                case 6:
                    bs.mostrarBaraja();
                    break;
                case 7:
                    bs.cartaActual();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opción válida.");
            }
        } while (opcion != 8);

    }

}
