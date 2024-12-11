package com.prog.NumberSeries;
//write a java program to count the number of digits in a given number.
public class CountNumberOfDigits {

	public static void main(String[] args) {

		int num = 44551155;
		int count = 0;
		while(num != 0) {
			count++;
			num = num/10; //remove last digit
			
		}
		System.out.println(count);
	}

}
