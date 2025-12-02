package com.kiran.arrays;

public class ArrayAvg {
	
	public int avgOfArray(int[] arr) {
		int sum = 0;
		int count = 0;
		
		for (int value : arr) {
			count += 1;
			sum += value;
		}
		
		int avg = sum /count; 
		return avg;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		
		ArrayAvg answer = new ArrayAvg();
		System.out.println(answer.avgOfArray(arr));
	}

}
