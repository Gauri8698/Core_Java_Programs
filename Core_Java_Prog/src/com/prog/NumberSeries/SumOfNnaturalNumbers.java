package com.prog.NumberSeries;

import java.util.Scanner;

//write program to add first N natural numbers
public class SumOfNnaturalNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		int num = 1;//here take 1 because natural number starts from 1
		int sum = 0;
		
		while(n > 0) {
		sum = sum+num;
		num++;
		n--;
		}
		System.out.println(sum);
		sc.close();
	}

}
