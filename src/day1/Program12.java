package day1;

import java.util.Scanner;

class Program12
{
	static void result(double math, double english,double physics,double chemistry)
	{
		double marks = math + english + physics + chemistry;
		double percentage = marks/4;
		System.out.println("Percentag is: " + percentage);

		if (percentage > 50)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter marks of Math :");
		double math = sc.nextDouble();
		System.out.println("Enter marks of English :");
		double english = sc.nextDouble();
		System.out.println("Enter marks of physics :");
		double physics = sc.nextDouble();
		System.out.println("Enter marks of chemistry :");
		double chemistry = sc.nextDouble();

		result(math,english,physics,chemistry);
	}
}
