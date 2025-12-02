package com.kiran.arrays;

public class ArraySum {

	public int sumOfArray(int[] arr) {
		int sum = 0;
		
		for (int value : arr) {
			sum += value;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		
		ArraySum anwser = new ArraySum();
		System.out.println(anwser.sumOfArray(arr));
	}

}