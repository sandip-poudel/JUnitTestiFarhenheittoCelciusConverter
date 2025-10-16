/**
 * Utility class for double‐precision temperature conversions.
 */
public class FahrenheitCelsiusConverter {

    /**
     * Converts Fahrenheit to Celsius.
     * @param fahrenheit temperature in degrees Fahrenheit
     * @return equivalent temperature in degrees Celsius
     */
    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    /**
     * Converts Celsius to Fahrenheit.
     * @param celsius temperature in degrees Celsius
     * @return equivalent temperature in degrees Fahrenheit
     */
    public static double toFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
}

