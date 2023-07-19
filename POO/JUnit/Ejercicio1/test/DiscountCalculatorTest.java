

import ejercicio1.entidades.DiscountCalculator;
import ejercicio1.services.DiscountCalculatorService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class DiscountCalculatorTest {
    
    public DiscountCalculatorTest() {
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
    public void calculatorTest(){
        DiscountCalculator calculo = new DiscountCalculator(200,100);
        DiscountCalculatorService ds = new DiscountCalculatorService();
        
        double resultado = ds.calcularDescuentoAplicado(calculo);
        assertEquals(50.0, resultado, 0);
    }
}
