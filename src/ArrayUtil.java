import java.util.ArrayList;
import java.util.List;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        // fill in code here
        List<String> commonElements = new ArrayList<>();

        for (String element1: array1){
            for (String element2: array2) {
                if (element1.equals(element2) && !commonElements.contains(element1)){
                    commonElements.add(element1);
                    break;
                }
            }
        }

        return commonElements.toArray(new String[0]);
    }

}