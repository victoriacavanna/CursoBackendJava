
package Entidad;


public class Cuenta {
    private int numeroCuenta;
    private String dniCliente;
    private int saldoActual;
    private double interes;
    
    public Cuenta(){
        
    }

    public Cuenta(int numeroCuenta, String dniCliente) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
    }
    
    public Cuenta(int numeroCuenta, String dniCliente, int saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    
    
}
