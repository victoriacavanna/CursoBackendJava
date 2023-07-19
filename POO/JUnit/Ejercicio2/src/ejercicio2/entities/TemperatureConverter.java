
package ejercicio2.entities;


public class TemperatureConverter {
    private double temperaturaAConvertir;
    private double conversionTemperatura;

    public TemperatureConverter() {
    }

    public TemperatureConverter(double temperaturaAConvertir) {
        this.temperaturaAConvertir = temperaturaAConvertir;
    }

    public double getTemperaturaAConvertir() {
        return temperaturaAConvertir;
    }

    public void setTemperaturaAConvertir(double temperaturaAConvertir) {
        this.temperaturaAConvertir = temperaturaAConvertir;
    }

    public double getConversionTemperatura() {
        return conversionTemperatura;
    }

    public void setConversionTemperatura(double conversionTemperatura) {
        this.conversionTemperatura = conversionTemperatura;
    }
    
    
}
