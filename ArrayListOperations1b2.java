
/*
 Write a java program for getting different colors through ArrayList interface 
 and remove the 2nd element and color "Blue" from the ArrayList
*/
package Assignment1;
import java.util.*;

public class ArrayListOperations1b2 {
    public static void main(String[] args) {

        // Creating ArrayList using List interface
        List<String> ls = new ArrayList<>();

        // Adding different colors to the list
        ls.add("Orange");
        ls.add("geen");   // typo kept as in original code
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Displaying original list
        System.out.println("Original List: " + ls);

        // Removing the 2nd element 
        // (index starts from 0, so index 1 represents 2nd element)
        ls.remove(1);
        System.out.println("After removing 2nd element: " + ls);

        // Removing the color "Blue" using value
        ls.remove("Blue");
        System.out.println("After removing 'Blue': " + ls);
    }
}