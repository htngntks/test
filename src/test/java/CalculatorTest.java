import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    @Test
    public void testAdd1() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.add(2, 3);
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDivide1() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.divide(6, 3);
        int expectedResult = 2;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDivide2() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(3, 0));
    }
    @Test
    public void testFilePath() {
        String expectedPath = "logs/app.log";
        File logFile = new File("logs", "app.log");
        assertEquals(expectedPath, logFile.getPath());
    }
}