package day1;

import java.util.Scanner;

class Program10
{
	//define method to get the area of a circle.
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter radius :");
		int radius = sc.nextInt();

		areaOfCircle(radius);
	}
	 static void areaOfCircle(int radius )
		{	
		double aoc = 3.14*(radius*radius);
		System.out.println("area of circle is " + aoc);
		}
}
