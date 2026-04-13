/*
 Write a java program for getting different colors through ArrayList interface 
 and extract the elements 1st and 2nd from the ArrayList object by using SubList()
*/
package Assignment1;

import java.util.*;

public class ArrayListOperations1b4 {
    public static void main(String[] args) {

        // Creating ArrayList using List interface
        List<String> ls = new ArrayList<>();

        // Adding different colors to the list
        ls.add("Orange");
        ls.add("geen");   // typo kept as in original code
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Displaying the original list
        System.out.println("Original List: " + ls);

        // Using subList() to extract elements
        // subList(start, end) -> start is inclusive, end is exclusive
        // (0,2) will return elements at index 0 and 1 (1st and 2nd elements)
        System.out.println("Using subList:");
        System.out.println(ls.subList(0, 2));
    }
}