/*
 2. Write a Java program to iterate a linked list in reverse order 
(using objlist.descendingIterator()) 
 */
 package Assignment1c;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class LinkedList1c2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>	ls = new LinkedList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		Iterator iterator =  ls.descendingIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			}
	}

}


