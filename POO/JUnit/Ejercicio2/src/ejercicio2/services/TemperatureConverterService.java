
package ejercicio2.services;

import ejercicio2.entities.TemperatureConverter;


public class TemperatureConverterService {
    public double celsiusToFahrenheit(TemperatureConverter calculo){
        return (calculo.getTemperaturaAConvertir() * 9/5) + 32; 
    }
    
    public double celsiusToKelvin(TemperatureConverter calculo){
        return calculo.getTemperaturaAConvertir() + 273.15; 
    }
    
    public double fahrenheitToCelsius(TemperatureConverter calculo){
        return (calculo.getTemperaturaAConvertir() - 32) * 5/9 ; 
    }
    
    public double fahrenheitToKelvin(TemperatureConverter calculo){
        return (calculo.getTemperaturaAConvertir() - 32) * 5/9 + 273.15; 
    }
    
    public double kelvinToCelsius(TemperatureConverter calculo){
        return calculo.getTemperaturaAConvertir() - 273.15; 
    }
    
    public double kelvinToFahrenheit(TemperatureConverter calculo){
        return (calculo.getTemperaturaAConvertir() - 273.15) * 9/5 + 32; 
    }
    
}
