
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculadoraTest {
    
    public CalculadoraTest() {
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
    public void testAdd(){
       Calculator calculator = new Calculator();
       assertEquals(4, calculator.add(2,2), 0);
    }
    
    @Test 
    public void testDivide(){
       Calculator calculator = new Calculator();
       assertEquals(1, calculator.divide(2,2), 0);
    }
    
    @Test 
    public void testMultiply(){
       Calculator calculator = new Calculator();
       assertEquals(4, calculator.multiply(2,2), 0);
    }
    
    @Test 
    public void testSubstract(){
       Calculator calculator = new Calculator();
       assertEquals(10, calculator.substract(20,10), 0);
    }
    
}
