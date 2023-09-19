package ejercicio6.entidades;

import ejercicio6.excepciones.TuException;
import java.util.Scanner;

public class claseC {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void metodoC() throws TuException {
        System.out.println("Ingresar una palabra de tres caracteres");
        String palabra = read.next();
        try {
            if (palabra.isEmpty()) {
                throw new TuException("Debe ingresarse una palabra");
            }
            if (palabra.length() != 3) {
                throw new TuException("Ingresar una palabra de tres caracteres");
            }
        } catch (TuException e) {
            System.out.println("Error." + e.getMessage());
//            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw new TuException("Error");
        }
    }
}
