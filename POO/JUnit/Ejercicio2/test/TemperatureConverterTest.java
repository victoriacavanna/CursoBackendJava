

import ejercicio2.entities.TemperatureConverter;
import ejercicio2.services.TemperatureConverterService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TemperatureConverterTest {
    
    public TemperatureConverterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test 
    public void testCelsius(){
        TemperatureConverter calculoCelsius = new TemperatureConverter(20);
        TemperatureConverterService ts = new TemperatureConverterService();
        
        assertEquals(68, ts.celsiusToFahrenheit(calculoCelsius), 0.0);
        assertEquals(293.15, ts.celsiusToKelvin(calculoCelsius), 0.0);
    }
    
    @Test
    public void testFahrenheit(){
        TemperatureConverter calculoFahrenheit = new TemperatureConverter(50);
        TemperatureConverterService ts = new TemperatureConverterService();
        
        assertEquals(10, ts.fahrenheitToCelsius(calculoFahrenheit), 0.0);
        assertEquals(283.15, ts.fahrenheitToKelvin(calculoFahrenheit), 0.0);
    }
    
    @Test
    public void testKelvin(){
        TemperatureConverter calculoKelvin = new TemperatureConverter(310);
        TemperatureConverterService ts = new TemperatureConverterService();
        
        assertEquals(36.85, ts.kelvinToCelsius(calculoKelvin), 0.02);
        assertEquals(98.33, ts.kelvinToFahrenheit(calculoKelvin), 0.02);
    }
}
