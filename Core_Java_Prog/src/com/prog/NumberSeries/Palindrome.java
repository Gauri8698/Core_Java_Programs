package com.prog.NumberSeries;
//write a java program to check whether the given number is palindrome
public class Palindrome {

	public static void main(String[] args) {

		int num = 121;
		int copy = num;
		int digit=0;
		int digit2= 0;

		while(num != 0) {
			
		digit = num%10;
		digit2=digit;
		num=num/10;
	 }
		if(digit == copy) {
			System.out.println("given number is palindrome");
		}else {
			System.out.println("number is not palindrome");
		}
  }

}
