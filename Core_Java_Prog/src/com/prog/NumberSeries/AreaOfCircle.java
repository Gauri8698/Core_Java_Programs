package com.prog.NumberSeries;

import java.util.Scanner;

//find area of circle
public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle ");
		double radius = sc.nextDouble();
		
		if(radius > 0) {
		double Area = 3.14*radius*radius;
		System.out.println(Area);
		}else {
			System.err.println("please enter the valid radius value");
		}
		sc.close();
	}
}
