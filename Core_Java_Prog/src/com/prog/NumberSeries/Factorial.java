package com.prog.NumberSeries;
//write a java program to calculate factorial of given number
public class Factorial {

	public static void main(String[] args) { //5! = 5*4*3*2*1
		int n = 5;
		int result=1;
		for(int num = 1;num <= n;num++) {
			result *= num;
		}
		System.out.println(result);

		
	}

}
