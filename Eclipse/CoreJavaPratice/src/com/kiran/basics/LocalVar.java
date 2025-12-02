package com.kiran.basics;

public class LocalVar {
	
	int localVar() {
		// Local variables are not allowed to be static in java 
		int num = 10;   
		
		return num;
	}
	
	
	public static void main(String[] args) {
		
		LocalVar obj = new LocalVar();
		System.out.println(obj.localVar());
	}
}
