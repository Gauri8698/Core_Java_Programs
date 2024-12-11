package com.prog.NumberSeries;
//Write a java program to calculate the product of all the odd numbers present between 1 and N.
public class ProductOfOdd {

	public static void main(String[] args) {

		int n = 10;
		int product = 1;
		for(int num = 1;num<=n;num++){
			if(num%2 != 0)
				product = product*num;
		}
		System.out.println(product);
	}

}
