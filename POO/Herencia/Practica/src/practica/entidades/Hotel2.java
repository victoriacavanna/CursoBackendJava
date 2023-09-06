
package practica.entidades;

public class Hotel2 extends Hotel1 {
    protected boolean pileta;
    protected boolean cochera;

    public Hotel2(int cantidadHabitaciones, double precio) {
        super(cantidadHabitaciones, precio);
    }

    
    public Hotel2(boolean pileta, boolean cochera, int cantidadHabitaciones, double precio) {
        super(cantidadHabitaciones, precio);
        this.pileta = pileta;
        this.cochera = cochera;
    }
    
}
