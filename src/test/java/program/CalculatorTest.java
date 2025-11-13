package program;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @Test
    void addValues() {
        assertEquals(4, Calculator.addValues(2, 2));
    }

    @Test
    void subtractValues() {
        assertEquals(0, Calculator.subtractValues(2, 2));
    }

    @Test
    void multiplyValues() {
        assertEquals(4, Calculator.multiplyValues(2, 2));
    }

    @Test
    void divisionValues() {
        assertEquals(1, Calculator.divisionValues(2, 2));
    }
}