package prosky.homework211.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import prosky.homework211.exception.ZeroDivideException;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static prosky.homework211.CalculatorConstants.*;

class CalculatorServiceImplParamTest {

    private final CalculatorServiceImpl service = new CalculatorServiceImpl();

    @MethodSource("provideParams")
    @ParameterizedTest
    public void shouldReturnCorrectSum(int num1, int num2) {
        assertEquals(num1 + num2, service.sum(num1, num2));
    }

    @MethodSource("provideParams")
    @ParameterizedTest
    public void shouldReturnCorrectSum2(int num1, int num2) {
        assertEquals(num1 + num2, service.sum(num1, num2));
    }

    @MethodSource("provideParams")
    @ParameterizedTest
    public void shouldReturnCorrectSubtract(int num1, int num2) {
        assertEquals(num1 - num2, service.subtract(num1, num2));
    }

    @MethodSource("provideParams")
    @ParameterizedTest
    public void shouldReturnCorrectSubtract2(int num1, int num2) {
        assertEquals(num1 - num2, service.subtract(num1, num2));
    }

    @MethodSource("provideParams")
    @ParameterizedTest
    public void shouldReturnCorrectMultiply(int num1, int num2) {
        assertEquals(num1 * num2, service.multiply(num1, num2));
    }

    @MethodSource("provideParams")
    @ParameterizedTest
    public void shouldReturnCorrectMultiply2(int num1, int num2) {
        assertEquals(num1 * num2, service.multiply(num1, num2));
    }

    @MethodSource("provideParams")
    @ParameterizedTest
    public void shouldReturnCorrectDivide(int num1, int num2) {
        assertEquals(num1 / num2, service.divide(num1, num2));
    }

    @MethodSource("provideParams")
    @ParameterizedTest
    public void shouldReturnCorrectDivide2(int num1, int num2) {
        assertEquals(num1 / num2, service.divide(num1, num2));
    }

    public static Stream<Arguments> provideParams() {
        return Stream.of(
                Arguments.of(ONE, TWO),
                Arguments.of(ONE, THREE),
                Arguments.of(THREE, ONE),
                Arguments.of(THREE, TWO),
                Arguments.of(THREE, THREE));
    }

}