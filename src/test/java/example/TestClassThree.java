package example;

import org.testng.annotations.Test;

public class TestClassThree {

    @Test(priority = 3)
    public void testMethodA() {
        System.out.println("Executing testMethodA");
    }

    @Test(priority = 2)
    public void testMethodB() {
        System.out.println("Executing testMethodB");
    }

    @Test(priority = 1)
    public void testMethodC() {
        System.out.println("Executing testMethodC");
    }
}