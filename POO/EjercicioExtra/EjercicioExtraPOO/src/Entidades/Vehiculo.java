
package Entidades;


public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String tipo;
    private int distancia = 0;

    public Vehiculo(){
        
    }
    public Vehiculo(String marca, String modelo, int anio, String tipo){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
    }
    
    public int getDistancia() {
        return distancia;
    }
   
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void moverse(int t){
        
        switch (tipo.toLowerCase()){
            case "automovil":
                distancia = 3 * t;
                break;
            case "motocicleta":
                distancia = 2 * t;
                break;
            case "bicicleta":
                distancia = 1 * t;
                break;
            default:
                distancia = 0;
                System.out.println("Datos inválidos");
        }
        System.out.println("El vehículo avanzó " + distancia + " metros");
    }
    public void frenar(int t){
        
        switch (tipo.toLowerCase()){
            case "automovil":
            case "motocicleta":
                distancia += 2;
                break;
            case "bicicleta":
                distancia = distancia;
                break;
            default:
                distancia = 0;
                System.out.println("Datos inválidos");
        }
        System.out.println("El vehículo "+ marca + " se detuvo a " + distancia + " metros");
    }
    
    
    
}
