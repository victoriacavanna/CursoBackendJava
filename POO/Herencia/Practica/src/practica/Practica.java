package practica;

import java.util.ArrayList;
import java.util.List;
import practica.entidades.Hotel;
import practica.entidades.Hotel1;
import practica.entidades.Hotel2;
import practica.entidades.Hotel3;
import practica.entidades.Hotel4;
import practica.entidades.Hotel5;

public class Practica {

    public static void main(String[] args) {
        List<Hotel> hoteles = new ArrayList();

        Hotel1 h1 = new Hotel1(9, 100d);
        Hotel2 h2 = new Hotel2(12, 120d);
        Hotel3 h3 = new Hotel3(15, 140d);
        Hotel4 h4 = new Hotel4(20, 160d);
        Hotel5 h5 = new Hotel5(25, 200d);

        hoteles.add(h1);
        hoteles.add(h2);
        hoteles.add(h3);
        hoteles.add(h4);
        hoteles.add(h5);

        for (Hotel aux : hoteles) {
            if (aux instanceof Hotel5) {
                Hotel5 object = (Hotel5) aux;
                System.out.println("Es un hotel 5 estrellas");
                continue;

            }
            if (aux instanceof Hotel4) {
                Hotel4 object = (Hotel4) aux;
                System.out.println("Es un hotel 4 estrellas");
                continue;
            }
            if (aux instanceof Hotel3) {
                Hotel3 object = (Hotel3) aux;
                System.out.println("Es un hotel 3 estrellas");
                continue;

            }
            if (aux instanceof Hotel2) {
                Hotel2 object = (Hotel2) aux;
                System.out.println("Es un hotel 2 estrellas");
                continue;

            }
            if (aux instanceof Hotel1) {
                Hotel1 object = (Hotel1) aux;
                System.out.println("Es un hotel 1 estrella");

            }
        }

    }

}
