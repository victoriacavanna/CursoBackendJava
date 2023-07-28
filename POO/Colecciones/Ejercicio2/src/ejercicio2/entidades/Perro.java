
package ejercicio2.entidades;

import java.util.Objects;

public class Perro implements Comparable<Perro> {
    private String nombre;
    private String raza;

    public Perro() {
    }

    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.nombre);
        hash = 61 * hash + Objects.hashCode(this.raza);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Perro other = (Perro) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Perro o) {
        return o.getNombre().compareTo(this.nombre);
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + '}';
    }
}

