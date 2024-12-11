package com.prog.NumberSeries;
//write the program to print first N natural Numbers
//natural number: all positive numbers are natural numbers
public class FirstNnaturalNumbers {

	public static void main(String[] args) {

		int n = 100;// we have to print up to n
		int num = 1;
		while(n > 0)
		{
			System.out.println(num);
			num++; //num+1
			n--;
		}
	}

}
