
package Entidades;


public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return this.frase.length();
    }

    public void setLongitud(String frase) {
        this.longitud = frase.length();
    }
   
}
