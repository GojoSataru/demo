package day1;

import java.util.Scanner;

class Program9 
{
	//define method to get the area of a squar.
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter side :");
		int side = sc.nextInt();

		areaOfSquare(side);
	}
	 static void areaOfSquare(int side )
		{	
		int aos = side*side;
		System.out.println("area of square is " + aos);
		}
}
