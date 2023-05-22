package day1;

import java.util.Scanner;

class Program7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter a age");
		int age = sc.nextInt();
		System.out.println("Enter a weight");
		int weight = sc.nextInt();
		
		if (age > 18 )
		{

			if (weight > 55 )
			{
				System.out.println("Elidgible for blood donation");
			}
			else
		{
			System.out.println("Not Elidgible");
		}
		}
		else
		{
			System.out.println("Not Elidgible");
		}
	}
}