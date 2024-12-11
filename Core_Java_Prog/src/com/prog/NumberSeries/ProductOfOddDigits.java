package com.prog.NumberSeries;
//write a java program to calculate the product of odd digits in a given number
public class ProductOfOddDigits {

	public static void main(String[] args) {

		int num = 5252;
		int product = 1;
		while(num>0) {
		int lastDigit = num%10; //get last digit
		if(lastDigit%2 != 0) {
			product = product*lastDigit;
		}
		num = num/10;
	}
		System.out.println(product);
		
	}

}
