package practica;

public class Practica {

    public static void main(String[] args) {

        try {
            int valor = Integer.valueOf("a");
            System.out.println("El numero indicado es: " + valor);
        } catch (NumberFormatException e) {
            System.out.println("El valor indicado no es un número");
        } catch (Exception e) {
            System.out.println("El valor indicado no es válido");

        } finally {
            int valor2 = 7;
            System.out.println("El segundo valor indicado es: " + valor2);
        }
         
    }

}
