import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleExceptionTest {

    /**
     * Test data for positive test.
     *
     * @return test data array
     */
    @DataProvider(name = "data")
    public static Object[][] data() {
        return new Object[][]{
                {2, 2, 4},
                {2, 3, 6},
                // add 2 more test data here
                {3, 5, 15},
                {4, 6, 24}
        };
    }

    /**
     * Test data for exception test.
     *
     * @return test data array
     */
    @DataProvider(name = "negativeData")
    public static Object[][] negativeData() {
        return new Object[][]{
                {-2, 2},
                {2, -2},
                // add 2 more test data here
                {-1, 1},
                {3, -3}
        };
    }

    @Test(dataProvider = "data")
    public void testRectangleArea(int a, int b, int c) {
        // put your code here
        int actualArea = ExampleException.rectangleArea(a, b);
        assertEquals(actualArea, c, "Area calculation is incorrect");
    }


    @Test(dataProvider = "negativeData")
    public void testRectangleAreaNegative(int a, int b) {
        // TODO put your code here
        try {
            ExampleException.rectangleArea(a, b);
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "input value is below zero!", "Exception message is incorrect");
            throw e;
        }
    }
}