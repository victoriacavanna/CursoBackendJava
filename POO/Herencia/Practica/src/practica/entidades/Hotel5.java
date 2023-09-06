
package practica.entidades;


public final class Hotel5 extends Hotel4 {
    protected boolean servicio24;
    protected String canchas;
    protected String restaurante;

    public Hotel5(int cantidadHabitaciones, double precio) {
        super(cantidadHabitaciones, precio);
    }

    public Hotel5(boolean servicio24, String canchas, String restaurante, boolean spa, boolean gimnasio, boolean desayuno, boolean servicioLimpieza, boolean pileta, boolean cochera, int cantidadHabitaciones, double precio) {
        super(spa, gimnasio, desayuno, servicioLimpieza, pileta, cochera, cantidadHabitaciones, precio);
        this.servicio24 = servicio24;
        this.canchas = canchas;
        this.restaurante = restaurante;
    }


    
    
}
