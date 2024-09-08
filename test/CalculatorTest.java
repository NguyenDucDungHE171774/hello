/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author T-Make
 */
public class CalculatorTest {
    Calculator cal;
    
    public CalculatorTest() {
        cal = new Calculator();
    }

    @Test
    public void testSomeMethod() {
        int rs = cal.add(4, 3);
        int expected = 7;
        assertEquals(expected, cal);
    }
    
}
