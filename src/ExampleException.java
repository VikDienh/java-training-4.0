public class ExampleException {

    public static int rectangleArea(int a, int b) {
        // put your code here
        if (a < 0 || b < 0){
            throw new IllegalArgumentException("input value is below zero!");
        }

        return a * b;
    }
}