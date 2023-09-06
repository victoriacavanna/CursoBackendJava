
package practica.entidades;

public class Hotel {
    protected int cantidadHabitaciones;
    protected double precio;

    public Hotel(int cantidadHabitaciones, double precio) {
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.precio = precio;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
