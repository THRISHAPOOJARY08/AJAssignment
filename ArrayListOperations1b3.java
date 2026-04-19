/*
 Write a java program for getting different colors through ArrayList interface 
 and sort them using Collections.sort( ArrayListObj)
*/
package Assignment1;

import java.util.*;

public class ArrayListOperations1b3 {
    public static void main(String[] args) {

        // Creating ArrayList using List interface
        List<String> ls = new ArrayList<>();

        // Adding different colors to the list
        ls.add("Orange");
        ls.add("geen");   // typo kept as in original code
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Displaying list before sorting
        System.out.println("Before sorting:");
        System.out.println(ls);

        // Sorting the ArrayList using Collections.sort()
        // It sorts elements in alphabetical (ascending) order
        Collections.sort(ls);

        // Displaying list after sorting
        System.out.println("After sorting:");
        System.out.println(ls);
    }
}