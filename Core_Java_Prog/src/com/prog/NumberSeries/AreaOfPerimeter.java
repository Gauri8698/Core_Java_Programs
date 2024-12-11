package com.prog.NumberSeries;
//find the Area of perimeter
import java.util.Scanner;

public class AreaOfPerimeter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of perimeter ");
		double radius = sc.nextDouble();
		
		if(radius > 0) {
		
			double area = 2*3.14*radius;
			System.out.println("Area of perimeter: "+area);
		}
		else {
			System.err.println("invalid radius value");
		}
		sc.close();
	}

}
