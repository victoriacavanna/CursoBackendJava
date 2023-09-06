
package practica.entidades;

public class Hotel3 extends Hotel2 {
    protected boolean desayuno;
    protected boolean servicioLimpieza;

    public Hotel3(int cantidadHabitaciones, double precio) {
        super(cantidadHabitaciones, precio);
    }

    
    public Hotel3(boolean desayuno, boolean servicioLimpieza, boolean pileta, boolean cochera, int cantidadHabitaciones, double precio) {
        super(pileta, cochera, cantidadHabitaciones, precio);
        this.desayuno = desayuno;
        this.servicioLimpieza = servicioLimpieza;
    }
    
    
}
