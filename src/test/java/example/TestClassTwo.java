package example;

import org.testng.annotations.*;

public class TestClassTwo {

    @Test
    @Parameters({"param1", "param2"})
    public void testWithXMLParams(String param1, String param2) {
        System.out.println("Received parameters from XML: param1 = " + param1 + ", param2 = " + param2);
    }

    @Test(dataProvider = "dataProviderMethod")
    public void testWithDataProvider(String input, int number) {
        System.out.println("Received from DataProvider: input = " + input + ", number = " + number);
    }

    @DataProvider
    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {"Test", 1},
                {"Data", 2}
        };
    }
}
