import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testProduct() {
        Calculator product = new Calculator();
        int prod = product.multiply(2,4);
        assertEquals(8,prod);
    }
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }
}



