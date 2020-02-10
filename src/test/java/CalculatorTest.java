import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() { calculator = new Calculator(); }

    @Test
    public void can_add(){
        int result = calculator.add(5, 98);
        assertEquals(103, result);
    }

    @Test public void can_subtract(){
        int result = calculator.subtract(100, 50);
        assertEquals(50, result);
    }

    @Test
    public void can_divide(){
        int result = calculator.divide(100, 2);
        assertEquals(50, result);
    }

    @Test
    public void can_multiply(){
        int result = calculator.multiply(100, 2);
        assertEquals(200, result);
    }
}


