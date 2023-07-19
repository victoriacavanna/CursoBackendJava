
package ejercicio1.entidades;


public class DiscountCalculator {
    private double montoInicial;
    private double descuento;
    private double montoFinal;

    public DiscountCalculator() {
    }

    public DiscountCalculator(double montoInicial, double montoFinal) {
        this.montoInicial = montoInicial;
        this.montoFinal = montoFinal;
    }

    public double getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(double montoInicial) {
        this.montoInicial = montoInicial;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }
    
    
}
