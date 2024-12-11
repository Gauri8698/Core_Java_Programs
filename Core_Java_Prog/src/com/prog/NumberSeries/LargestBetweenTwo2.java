package com.prog.NumberSeries;

//find largest number between two using only one if block 
public class LargestBetweenTwo2 {

	public static void main(String[] args) {

		int a = 30;
		int b = 20;
		
		String largest = "largest number is: "+a;
		
		if(a < b) {
		largest="largest number is: "+b;
		}
		
		System.out.println(largest);
	}

}
