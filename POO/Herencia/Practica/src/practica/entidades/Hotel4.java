package practica.entidades;


public class Hotel4 extends Hotel3{
    protected boolean spa;
    protected boolean gimnasio;

    public Hotel4(int cantidadHabitaciones, double precio) {
        super(cantidadHabitaciones, precio);
    }

    
    public Hotel4(boolean spa, boolean gimnasio, boolean desayuno, boolean servicioLimpieza, boolean pileta, boolean cochera, int cantidadHabitaciones, double precio) {
        super(desayuno, servicioLimpieza, pileta, cochera, cantidadHabitaciones, precio);
        this.spa = spa;
        this.gimnasio = gimnasio;
    }


}
