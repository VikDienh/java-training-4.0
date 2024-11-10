import static org.testng.Assert.assertEquals;

import java.util.stream.IntStream;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumAverageTest {

    /**
     * Test data for lower and upper bounds.
     *
     * @return test data array
     */
    @DataProvider(name = "Sum")
    public static Object[][] sum() {
        return new Object[][]{
                {1, 100, 5050},
                {-100, 100, 0},
                {1, 1, 1},
                {-50, 0, -1275},
                {5, 16, 126}
                // add 2 more test data here
        };
    }

    /**
     * Test data for lower and upper bounds.
     *
     * @return test data array
     */
    @DataProvider(name = "Average")
    public static Object[][] average() {
        return new Object[][]{
                {1, 100, 50.5},
                {-100, 100, 0.0},
                {1, 1, 1.0},
                {4, 8, 6.0},
                {20, 66, 43.0},
                {1, 10, 5.5}
                // add 2 more test data here
        };
    }

    @Test(dataProvider = "Sum")
    public void testSumArray(int lowerBound, int upperBound, int expectedResult) {
        int actualResult = SumAverage.sum(lowerBound, upperBound);

        assertEquals(actualResult, expectedResult, "Sum is not correct");
    }

    @Test(dataProvider = "Sum")
    public void testSum1(int lowerBound, int upperBound, int expectedResult) {
        int[] numbers = IntStream.range(lowerBound, upperBound + 1).toArray();
        int actualResult = SumAverage.sum(numbers);

        assertEquals(actualResult, expectedResult, "Sum is not correct");
    }

    @Test(dataProvider = "Average")
    public void testAverage(int lowerBound, int upperBound, double expectedResult) {
        double actualResult = SumAverage.average(lowerBound, upperBound);

        assertEquals(actualResult, expectedResult, "Average is not correct");
    }

    @Test(dataProvider = "Average")
    public void testAverageArray(int lowerBound, int upperBound, double expectedResult) {
        int[] numbers = IntStream.range(lowerBound, upperBound + 1).toArray();
        double actualResult = SumAverage.average(numbers);

        assertEquals(actualResult, expectedResult, "Average is not correct");
    }
}