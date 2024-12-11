package com.prog.NumberSeries;
//write a java program to print all the numbers between 1 and N which are multiple of 5
public class MultipleOfFive {

	public static void main(String[] args) {
		
		int n = 100;
		for(int num = 1; num<=n;num++) {
			if(num%5 == 0) {
				System.out.println(num);
				}
		}
		
	}
}



	