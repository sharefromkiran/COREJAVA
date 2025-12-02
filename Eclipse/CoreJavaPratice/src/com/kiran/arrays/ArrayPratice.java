package com.kiran.arrays;

import java.util.Arrays;

public class ArrayPratice {
	public static void main(String[] args) {
		
		/*
		 * Array        --- Core Java feature (Not part of Collections Framework)
		 *
		 * Size         --- Fixed size (Cannot grow or shrink after creation)
		 * Capacity     --- Same as size (Because array length is constant)
		 *                 int[] arr = new int[10];  // Capacity = 10
		 *
		 *
		 * Default Capacity                  --- No default (Must specify size)
		 * Initial Capacity                  --- Whatever size you give
		 * Allow Duplicates                  --- Yes
		 * Allow null values                 --- Yes (Only for object arrays)
		 * Maintain the insertion order      --- Yes
		 * Maintain the sorted order         --- No
		 * Offer random access               --- Yes (arr[index] is O(1))
		 * Synchronized                      --- No
		 * Thread Safe                       --- No
		 *
		 * What is it good at?               --- Best performance (fastest structure),
		 *                                      Used when size is fixed,
		 *                                      Best for primitive data storage.
		 *
		 * Limitations                       --- Fixed size,
		 *                                      No built-in methods (search, add, remove),
		 *                                      Must manually handle resizing.
		 */
		
		int[] intArr = new int[5];
		
		intArr[0] = 28;
		intArr[1] = 23;
		intArr[4] = 13;
		
		// Ljava.lang.String --- Array of Strings & hashcode
		System.out.println(intArr);
		
		//Print new array
		System.out.println(Arrays.toString(intArr));
		
		//Print one by one value
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}
}
