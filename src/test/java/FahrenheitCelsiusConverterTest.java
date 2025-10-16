import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Parameterized tests for FahrenheitCelsiusConverter.
 */
public class FahrenheitCelsiusConverterTest {

    // Allowed tolerance for double comparisons
    private static final double DELTA = 0.0001;

    @ParameterizedTest(name = "{index} => {0}°F = {1}°C")
    @CsvSource(textBlock = """
        -40, -40.0
         32,   0.0
         98.6, 37.0
        212, 100.0
        """)
    void testToCelsius(double fahrenheit, double expectedCelsius) {
        double actual = FahrenheitCelsiusConverter.toCelsius(fahrenheit);
        assertEquals(expectedCelsius, actual, DELTA);
    }

    @ParameterizedTest(name = "{index} => {0}°C = {1}°F")
    @CsvSource(textBlock = """
        -40, -40.0
          0,  32.0
         37,  98.6
        100, 212.0
        """)
    void testToFahrenheit(double celsius, double expectedFahrenheit) {
        double actual = FahrenheitCelsiusConverter.toFahrenheit(celsius);
        assertEquals(expectedFahrenheit, actual, DELTA);
    }
}
