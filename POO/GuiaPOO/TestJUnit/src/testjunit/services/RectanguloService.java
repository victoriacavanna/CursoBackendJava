
package testjunit.services;

import testjunit.entities.Rectangulo;


public class RectanguloService {
    public double calcularArea(Rectangulo r){
        return r.getAncho() * r.getLargo();
    }
    
    public double calcularPerimetro(Rectangulo r){
        return 2 * (r.getAncho() + r.getLargo());
    }
}
