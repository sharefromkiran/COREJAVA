package com.kiran.collection;

import java.util.*;

public class VectorPratice {
	
	public static void main(String[] args) {
		
		/*
		 * Vector      --- Java 1.0 Legacy Class (Before Collections Framework)
		 * Collection  --- Added into Collections Framework in Java 1.2
		 * Generics    --- Introduced in Java 1.5  <Wrapper Class | Objects>
		 *
		 * Size        --- Number of elements currently stored
		 * Capacity    --- Internal array size (Default = 10)
		 *                 You can give custom initial size:
		 *                 Vector<String> v = new Vector<>(20);
		 *
		 *
		 * Default Capacity                  --- 10
		 * Initial Capacity                  --- 10
		 * Allow Duplicates                  --- Yes
		 * Allow null values                 --- Yes
		 * Maintain the insertion order      --- Yes
		 * Maintain the sorted order         --- No
		 * Offer random access               --- Yes (Array-based)
		 * Synchronized (One task at a time) --- Yes (Every method is synchronized)
		 * Thread Safe                       --- Yes (But outdated due to overhead)
		 *
		 * Expansion Rule                    --- New capacity = old capacity * 2
		 *                                      (Doubles size when full)
		 *
		 * What is it good at?               --- Multi-threading (Old legacy apps),
		 *                                      When data increases exponentially,
		 *                                      When thread-safety is required without
		 *                                      using external synchronization.
		 */

		
		
		// Creation of a vector
		Vector<String> vc1 = new Vector<>();
		
		
		
		// Addition of elements into the list
		vc1.add("Rattaiah");
		vc1.add("Manikyam");
		vc1.add("Kiran");
		vc1.add("Vamsi");
		vc1.add("Akash");
		
		Vector<String> vc2 = new Vector<>();
		vc2.add("Ravi");
		vc2.add("Mohan");
		vc2.add("Vasanth");
		vc2.add("Yesu");
		vc2.add(2,"Pradeep");
		vc2.add(null);
		
		
		Vector<String> vc3 = new Vector<>();
		vc3.addAll(vc2);
		vc3.addAll(0,vc1);
		
		System.out.println("Size: " + vc1.size());
		System.out.println("capacity: " + vc1.capacity());
		System.out.println(vc1);
		System.out.println(vc2);
		System.out.println(vc3);
		
		
		
		System.out.println("\n");
		// Retrival of elements from the list
		System.out.println(vc1.get(6));
		System.out.println(vc2.getLast());
		System.out.println(vc2.getFirst());
		System.out.println(vc1.getClass());
		System.out.println(vc1.toString());
		System.out.println(vc1.firstElement());
		System.out.println(vc1.lastElement());
		
		System.out.println(vc1);
		System.out.println(vc2);
		
		
		
		System.out.println("\n");
		// Deletion of elements from the list
		System.out.println(vc1.remove(9));
		System.out.println(vc1.remove("Bakash"));
		
		vc2.clear();    // vc2.removeAllElements(); both same print []
		
		System.out.println(vc1);
		System.out.println(vc2);
		
		
		
		System.out.println("\n");
		// Verification of elements in the list
		System.out.println(vc1.contains("Kiran"));
		System.out.println(vc2.containsAll(vc1));
		
		System.out.println(vc1);
		System.out.println(vc2);
		
		
		
		System.out.println("\n");
		// Updation of the elements in the list
		vc1.set(0, "Davidu");
		
		System.out.println(vc1);
		System.out.println(vc2);
		
		
		
		
		System.out.println("\n");
		// List<Vector> to convert Array
		Object[] arr = vc1.toArray();
		System.out.println(Arrays.toString(arr));
		
		System.out.println(vc1);
		System.out.println(vc2);
		
		
		
		System.out.println("\n");
		// Array to convert List<Vector>
		Object[] array = new Object[] {1,4,3,5,6,7};
		Vector<Object> vc4 = new Vector<>(Arrays.asList(array));
		
		System.out.println(vc4); 
		
		// Size and Capacity Defalut like array elements.
		System.out.println("Size: " + vc4.size());           
		System.out.println("capacity: " + vc4.capacity());
		
	}
}
