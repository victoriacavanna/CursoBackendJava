/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import testjunit.entities.Rectangulo;
import testjunit.services.RectanguloService;

/**
 *
 * @author 54381
 */
public class RectanguloTest {
    
    public RectanguloTest() {
    }
    
    RectanguloService rs;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        rs = new RectanguloService(); //Antes de ejecutarse cada test se inicialice uno nuevo
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void deberiaInicializarConColor(){
        assertNotNull(new Rectangulo(10,10).getColor());
    }
    
    @Test 
    public void deberiaCalcularArea(){
        assertEquals(100, rs.calcularArea(new Rectangulo(10,10)), 0);
        assertEquals(20, rs.calcularArea(new Rectangulo(4,5)), 0);
        assertEquals(1, rs.calcularArea(new Rectangulo(1,1)), 0);
    }
    
    @Test 
    public void deberiaCalcularPerimetro(){
        assertEquals(40, rs.calcularPerimetro(new Rectangulo(10, 10)), 0);
        assertEquals(60, rs.calcularPerimetro(new Rectangulo(15, 15)), 0);
        assertEquals(100, rs.calcularPerimetro(new Rectangulo(30, 20)), 0);
    }
    
    @Test 
    public void deberiaActivarODesactivar(){
        Rectangulo r = new Rectangulo(5, 5);
        assertTrue(r.isActive());
        r.setActive(false);
        assertFalse(r.isActive());
    }
}
