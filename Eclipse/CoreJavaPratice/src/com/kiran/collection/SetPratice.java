package com.kiran.collection;

public class SetPratice {
	public static void main(String[] args) {
		
		/*
		 * Set          --- Introduced in Java 1.2 (Collections Framework)
		 * Package      --- java.util
		 * Generics     --- Introduced in Java 1.5 <Wrapper Class | Objects>
		 *
		 * Concept      --- Stores UNIQUE elements
		 *                  (No duplicates allowed)
		 *
		 * Size         --- Number of elements currently stored
		 * Capacity     --- Depends on implementation (HashSet default = 16)
		 *                 Set<Integer> set = new HashSet<>(20);
		 *
		 *
		 * Allow Duplicates                  --- No
		 * Allow null values                 --- Yes (HashSet & LinkedHashSet allow 1 null)
		 * Maintain insertion order          --- Only LinkedHashSet
		 * Maintain sorted order             --- Only TreeSet
		 * Random Access                     --- No
		 * Synchronized                      --- No
		 * Thread Safe                       --- No (Unless using Collections.synchronizedSet)
		 *
		 *
		 * Common Implementations:
		 * ---------------------------------
		 * HashSet          --- Fastest, no order, allows one null
		 * LinkedHashSet    --- Maintains insertion order
		 * TreeSet          --- Sorted set (Ascending order, Red-Black Tree)
		 *
		 *
		 * What is it good at?               --- Removing duplicates,
		 *                                      Fast membership checking (contains),
		 *                                      Storing unique IDs, tags, categories,
		 *                                      Mathematical set operations.
		 *
		 *
		 * Important Set Methods:
		 * ---------------------------------
		 * add(element)         --- Insert element
		 * remove(element)      --- Remove element
		 * contains(element)    --- Check presence
		 * size()               --- Returns number of elements
		 * isEmpty()            --- Check empty or not
		 * clear()              --- Removes all elements
		 *
		 *
		 * Performance:
		 * ---------------------------------
		 * HashSet      --- add/remove/contains = O(1)
		 * LinkedHashSet --- Slightly slower due to ordering
		 * TreeSet       --- add/remove/contains = O(log n)
		 *
		 *
		 * Limitations                        --- No indexing,
		 *                                      No duplicate elements allowed,
		 *                                      TreeSet does not allow null elements.
		 */

	}
}
