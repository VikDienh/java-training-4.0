package example;

import org.testng.annotations.*;

public class TestClassOne {

    @BeforeGroups("group1")
    public void setupGroup1() {
        System.out.println("Setup for group1");
    }

    @AfterGroups(value = "group1")
    public void teardownGroup1() {
        System.out.println("Teardown for group1");
    }

    @Test(groups = {"group1"})
    public void testMethod1() {
        System.out.println("Executing testMethod1 in group1");
    }

    @Test(groups = {"group1"})
    public void testMethod2() {
        System.out.println("Executing testMethod2 in group1");
    }

    @BeforeGroups("group2")
    public void setupGroup2() {
        System.out.println("Setup for group2");
    }

    @AfterGroups(value = "group2", alwaysRun = true)
    public void teardownGroup2() {
        System.out.println("Teardown for group2");
    }

    @Test(groups = {"group2"})
    public void testMethod3() {
        System.out.println("Executing testMethod3 in group2");
    }

    @Test(groups = {"group2"})
    public void testMethod4() {
        System.out.println("Executing testMethod4 in group2");
    }
}