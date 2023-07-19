
package ejercicio1.services;

import ejercicio1.entidades.DiscountCalculator;

public class DiscountCalculatorService {
    public double calcularDescuentoAplicado(DiscountCalculator calculo ){
        double descuento = calculo.getMontoInicial() - calculo.getMontoFinal();
        double porcentaje = (descuento / calculo.getMontoInicial()) * 100;
        return porcentaje;
    }
}
