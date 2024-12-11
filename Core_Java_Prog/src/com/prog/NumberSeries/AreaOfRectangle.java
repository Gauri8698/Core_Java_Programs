package com.prog.NumberSeries;

//Find the Area of rectangle
import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		double length = sc.nextDouble();
		System.out.println("Enter the breadth of rectangle");
		double breadth = sc.nextDouble();
		
		if(length > 0 && breadth >0) {
			
			double Area = length*breadth;
			System.out.println(Area);
			
		}else 
			System.err.println("invalid value of length or breadth");
		
		sc.close();
	}

}
