package prosky.homework211.service;

import org.junit.jupiter.api.Test;
import prosky.homework211.CalculatorConstants;
import prosky.homework211.exception.ZeroDivideException;
import static prosky.homework211.CalculatorConstants.ZERO;
import static prosky.homework211.CalculatorConstants.THREE;
import static org.junit.jupiter.api.Assertions.*;
import static prosky.homework211.CalculatorConstants.ONE;
import static prosky.homework211.CalculatorConstants.TWO;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl service = new CalculatorServiceImpl();

    @Test
    public void shouldReturnCorrectSum() {
        assertEquals(ONE + TWO, service.sum(ONE, TWO));
    }
    @Test
    public void shouldReturnCorrectSu2() {
        assertEquals(ONE + THREE, service.sum(ONE, THREE));
    }

    @Test
    public void shouldReturnCorrectSubtract() {
        assertEquals(THREE - TWO, service.subtract(THREE, TWO));
    }
    @Test
    public void shouldReturnCorrectSubtract2() {
        assertEquals(THREE - ONE, service.subtract(THREE, ONE));
    }

    @Test
    public void shouldReturnCorrectMultiply() {
        assertEquals(THREE * TWO, service.multiply(THREE, TWO));
    }
    @Test
    public void shouldReturnCorrectMultiply2() {
        assertEquals(THREE * THREE, service.multiply(THREE, THREE));
    }

    @Test
    public void shouldReturnCorrectDivide() {
        assertEquals(THREE / TWO, service.divide(THREE, TWO));
    }
    @Test
    public void shouldReturnCorrectDivide2() {
        assertEquals(THREE / ONE, service.divide(THREE, ONE));
    }
    @Test
    public void shouldThrowZeroDivideException(){
        assertThrows(ZeroDivideException.class,()-> service.divide(THREE,ZERO));
    }
}