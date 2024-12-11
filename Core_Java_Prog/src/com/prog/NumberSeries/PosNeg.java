package com.prog.NumberSeries;
//check no is positive or negative without using else if ladder
import java.util.Scanner;

public class PosNeg {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num  =sc.nextInt();
		String res = "zero";
		
		if(num != 0) {
			if(num >0) {
				res = "positive";
			}else {
				res="negative";
			}
		}
		System.out.println(res);
		sc.close();
	}

}
