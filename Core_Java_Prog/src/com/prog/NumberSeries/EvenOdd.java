package com.prog.NumberSeries;

import java.util.Scanner;

//check number is even or odd without using modulus operator
public class EvenOdd {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(num > 0) {
		while(num > 0)
		{
		num = num-2;
		}
		if(num == 0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
	}
		
	else {
		System.out.println("invalid number");
	}
		sc.close();
	}
	
	
}
