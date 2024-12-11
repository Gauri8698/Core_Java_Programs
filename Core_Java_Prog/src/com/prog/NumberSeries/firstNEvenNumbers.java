package com.prog.NumberSeries;
//print all the even number 1 to 100
public class firstNEvenNumbers {

	public static void main(String[] args) {
		int n = 100;
		
		for(int num = 2;num <= n ;num++) {
			
			if(num % 2 == 0) {
				System.out.println(num);
			}
		}
		
	}
}
