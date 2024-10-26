import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TemperatureTest {

    /**
     * Test data for Fahrenheit to Celsius conversion.
     * @return test data array
     */
    @DataProvider(name = "Fahrenheit")
    public static Object[][] fahrenheit() {
        return new Object[][]{
                {212.0, 100.0},
                {32.0, 0.0},
                {-15, -26.11111111111111},
                // add 2 more test data here
                {68.0, 20.0},
                {50.0, 10.0},
                {122.0, 50.0},
                {5.0, -15.0},
                {-16.6, -27.0}
        };
    }

    /**
     * Test data for Celsius to Fahrenheit conversion.
     * @return test data array
     */
    @DataProvider(name = "Celsius")
    public static Object[][] celsius() {
        return new Object[][]{
                {100.0, 212.0},
                {0.0, 32.0},
                {-26.11111111111111, -15},
                // add 2 more test data here
                {20.0, 68.0},
                {10.0, 50.0},
                {50.0, 122},
                {-15.0, 5.0},
                {-27.0, -16.6}
        };
    }

    @Test(dataProvider = "Fahrenheit")
    public void testFahrenheitToCelsius(double fahrenheit, double expectedResult) {
        double actualResult = Temperature.fahrenheitToCelsius(fahrenheit);

        assertEquals(actualResult, expectedResult, "Conversion from Fahrenheit to Celsius is wrong");
    }

    @Test(dataProvider = "Celsius")
    public void testCelsiusToFahrenheit(double celsius, double expectedResult) {
        double actualResult = Temperature.celsiusToFahrenheit(celsius);

        assertEquals(actualResult, expectedResult, "Conversion from Celsius to Fahrenheit is wrong");
    }
}