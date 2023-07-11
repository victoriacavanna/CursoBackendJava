
package Servicio;
import java.util.Scanner;
import Entidad.Cuenta;

public class CuentaService {
    private Scanner read = new Scanner(System.in);
    
    public Cuenta crearCuenta(){
        System.out.println("Ingresar su número de cuenta: ");
        int numeroCuenta = read.nextInt();
        
        System.out.println("Ingresar su dni: ");
        String dniCliente = read.next();
        
        Cuenta c = new Cuenta(numeroCuenta, dniCliente);
        
        return c;
    }
    
    public void ingresar(double ingreso, Cuenta cuenta){
        int saldoAct = cuenta.getSaldoActual();
        saldoAct += ingreso;
        cuenta.setSaldoActual(saldoAct);
    }
    
    public void retirar(double retiro, Cuenta cuenta){
        int saldoAct = cuenta.getSaldoActual();
        if (saldoAct >= retiro){
            saldoAct -= retiro;
        } else {
            saldoAct = 0;
        }
        cuenta.setSaldoActual(saldoAct);
    }
    
    public void extraccionRapida(Cuenta cuenta){
        
        int saldoAct = cuenta.getSaldoActual();
        System.out.println("Ingrese la cantidad a retirar: ");
        double retiro = read.nextDouble();
        
        if (retiro < saldoAct * 0.2) {
            saldoAct -= retiro;
            cuenta.setSaldoActual((int)saldoAct);
        } else {
            System.out.println("No es posible extraer más del 20%");
        }
    }
    
    public void consultarSaldo(Cuenta cuenta){
        System.out.println("Saldo actual: " + cuenta.getSaldoActual()); 
    }
    
    public void consultarDatos(Cuenta cuenta){
        System.out.println("N° de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI: " + cuenta.getDniCliente());
        System.out.println("Saldo Actual: " + cuenta.getSaldoActual());
    }
    
}
