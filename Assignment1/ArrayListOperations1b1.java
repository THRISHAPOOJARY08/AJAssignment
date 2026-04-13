/*1. Write a java program for getting different colors through ArrayList interface and 
 search whether the color "Red" is available or not
 */
package Assignment1;

import java.util.*;

public class ArrayListOperations1b1 {
 public static void main(String[] args) {

     // Creating ArrayList to store colors
     ArrayList<String> colors = new ArrayList<>();

     // Adding elements to ArrayList
     colors.add("Blue");
     colors.add("Green");
     colors.add("Red");
     colors.add("Yellow");

     // Checking if "Red" is present using contains()
     if(colors.contains("Red")) {
         System.out.println("Red color is available");
     } else {
         System.out.println("Red color is NOT available");
     }
 }
}