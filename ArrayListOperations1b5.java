/*
 Write a java program for getting different colors through ArrayList interface 
 and delete nth element from the ArrayList object by using remove by index
*/
package Assignment1;

import java.util.*;

public class ArrayListOperations1b5 {
    public static void main(String[] args) {

        // Creating ArrayList using List interface
        List<String> ls = new ArrayList<>();

        // Adding different colors to the list
        ls.add("Orange");
        ls.add("green");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Displaying original list
        System.out.println("Original List: " + ls);

        // Declaring n (position to delete)
        int n = 3;  // example: delete 3rd element

        // Removing nth element using index (n-1 because index starts from 0)
        if(n > 0 && n <= ls.size()) {
            System.out.println("Removing the " + n + "th element: " + ls.remove(n - 1));
        } else {
            System.out.println("Invalid position");
        }

        // Displaying updated list
        System.out.println("Updated List: " + ls);
    }
}