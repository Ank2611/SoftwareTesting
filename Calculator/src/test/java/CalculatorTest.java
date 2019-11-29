import org.junit.Assert;
import sda.com.Calculator.Calculator;
import org.junit.Test;


public class CalculatorTest {
    private Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        int sum = calc.add(5, 2);
        Assert.assertEquals(7, sum);
    }

    @Test
    public void testSubstract() {
        int diff = calc.substract(10, 4);
        Assert.assertEquals(6, diff);
    }

    @Test
    public void testMultiply() {
        int prod = calc.multiply(25, 3);
        Assert.assertEquals(75, prod);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivide() {
        int divideToZero = calc.divide(14, 0);

    }
}
