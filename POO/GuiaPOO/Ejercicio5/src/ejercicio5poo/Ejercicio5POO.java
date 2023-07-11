

package ejercicio5poo;

import Entidad.Cuenta;
import Servicio.CuentaService;

public class Ejercicio5POO {

    public static void main(String[] args) {
        CuentaService cuentaService = new CuentaService();
        
        Cuenta cuenta = cuentaService.crearCuenta();
        
        double ingreso = 400;
        cuentaService.ingresar(ingreso, cuenta);
        
        double retiro = 100;
        cuentaService.retirar(retiro, cuenta);
        
        cuentaService.consultarSaldo(cuenta);
        
        cuentaService.extraccionRapida(cuenta);
        
        cuentaService.consultarDatos(cuenta);
    }

}
