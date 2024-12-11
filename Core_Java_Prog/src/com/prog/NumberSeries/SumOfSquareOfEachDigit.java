package com.prog.NumberSeries;
//write a java program to calculate the sum of the squares of each digit in a given number
public class SumOfSquareOfEachDigit {

	public static void main(String[] args) {
		
		int num = 22;
		int square = 1;
		int sum = 0;
		
		while(num != 0) {
		int digit = num%10; //get last digit
		square=digit*digit; 
		sum = sum+square;
		num=num/10;
		}
		System.out.println(sum);
		
	}
}
