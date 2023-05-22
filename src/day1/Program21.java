package day1;

import java.util.Scanner;

class Program21
{
	//to find the factorial of first n natural numbers using loop.
	static int fact(int a)
	{
		int factorial=1;
		if (a > 1)
		{
		 return a*factorial(a-1);
		}
		else
		{
			return 1;
		}
		return factoria;;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nth number");
		int a = sc.nextInt();
		System.out.println(fact(a));
		
	}
}
/* 
fact = 1;
fact = fact*i
i--;
*/