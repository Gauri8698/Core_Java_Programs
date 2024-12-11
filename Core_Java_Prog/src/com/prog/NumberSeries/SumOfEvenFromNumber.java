package com.prog.NumberSeries;
//write a java program to calculate sum of even digits in a given number
public class SumOfEvenFromNumber {

	public static void main(String[] args) {

		int num = 2456;
		int sum = 0;
		while(num != 0) {
			int digit = num%10; //get last digit 6
			if(digit%2 == 0) {
				sum = sum+digit;
			}
			num = num/10;
		}
		System.out.println(sum);
	}

}
