package com.kiran.collection;

public class MapPratice {
	public static void main(String[] args) {
		
		/*
		 * Map stores data in key–value pairs where keys are unique and values may repeat.
		 * 
		 * Map          --- Introduced in Java 1.2 (Collections Framework)
		 * Package      --- java.util
		 * Generics     --- Introduced in Java 1.5 <Key, Value>
		 *
		 * Concept      --- Stores data in KEY–VALUE pairs
		 *                  Keys must be unique, Values can be duplicated
		 *
		 * Size         --- Number of key-value mappings stored
		 * Capacity     --- Depends on implementation (HashMap default = 16)
		 *                 HashMap<String, Integer> map = new HashMap<>(20);
		 *
		 *
		 * Allow Duplicate Keys             --- No
		 * Allow Duplicate Values           --- Yes
		 * Allow null Key                   --- Yes (Only in HashMap, LinkedHashMap)
		 * Allow null Values                --- Yes
		 * Maintain insertion order         --- Only LinkedHashMap
		 * Maintain sorted order            --- Only TreeMap (Sorted by keys)
		 * Random Access                    --- No (Uses hashing/tree traversal)
		 * Synchronized                     --- No (Except Hashtable)
		 * Thread Safe                      --- No (HashMap), Yes (ConcurrentHashMap/Hashtable)
		 *
		 *
		 * Common Implementations:
		 * ---------------------------------
		 * HashMap            --- Fastest, no order, allows null key/value
		 * LinkedHashMap      --- Maintains insertion order
		 * TreeMap            --- Sorted map (Red-Black Tree)
		 * Hashtable          --- Synchronized (Legacy, slow)
		 * ConcurrentHashMap  --- Thread-safe + Fast (Recommended for concurrency)
		 *
		 *
		 * What is it good at?              --- Fast lookup using keys,
		 *                                     Caching,
		 *                                     Storing configuration,
		 *                                     Counting frequency (word count),
		 *                                     Indexing data,
		 *                                     Database-like key-value operations.
		 *
		 *
		 * Important Map Methods:
		 * ---------------------------------
		 * put(key, value)        --- Insert or update value
		 * get(key)               --- Return value associated with key
		 * remove(key)            --- Remove entry for given key
		 * containsKey(key)       --- Check if key exists
		 * containsValue(value)   --- Check if value exists
		 * size()                 --- Total entries
		 * keySet()               --- Returns all keys
		 * values()               --- Returns all values
		 * entrySet()             --- Returns key-value pairs
		 *
		 *
		 * Limitations                        --- No duplicate keys,
		 *                                      No direct indexing,
		 *                                      TreeMap slower than HashMap,
		 *                                      HashMap not thread-safe.
		 */

	}
}
