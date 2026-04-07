
/* 
1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a LinkedList to perform the following operations:
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4. Accessing elements, 5. Updating elements, 
6. Removing elements, 7. Searching elements, 8. List size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list
*/
package Assignment1;
import java.util.*;

public class Collection1a {
    public static void main(String[] args) {
        // 1. Adding elements to ArrayList
        ArrayList<String> al = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
        LinkedList<String> ll = new LinkedList<>(al);

        System.out.println("Initial ArrayList: " + al);

        // 2. Adding at specific index
        al.add(1, "Mango"); 
        
        // 3. Adding multiple elements
        List<String> extras = Arrays.asList("Grapes", "Pineapple");
        al.addAll(extras);

        // 4. Accessing elements
        System.out.println("Element at index 2: " + al.get(2));

        // 5. Updating elements
        al.set(0, "Strawberry");

        // 6. Removing elements
        al.remove("Banana");

        // 7. Searching
        System.out.println("Does it contain Apple? " + al.contains("Apple"));

        // 8. List size
        System.out.println("Size of list: " + al.size());

        // 9. Iterating (For-each)
        System.out.print("Iterating: ");
        for(String fruit : al) System.out.print(fruit + " ");
        System.out.println();

        // 10. Using Iterator
        Iterator<String> it = al.iterator();
        System.out.print("Using Iterator: ");
        while(it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();

        // 11. Sorting
        Collections.sort(al);
        System.out.println("Sorted List: " + al);

        // 12. Sublist (from index 1 to 3)
        System.out.println("Sublist: " + al.subList(1, 3));

        // 13. Clearing the list
        al.clear();
        System.out.println("List after clearing: " + al);
    }
}