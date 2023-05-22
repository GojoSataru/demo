package day1;

import java.util.Scanner;

class Program50 
{
	static void largest(int a,int b)
	{
		if (a>b)
		{
			System.out.println(a +" is largest.");
		}
		else
		{
			System.out.println(b +" is largest.");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number 1");
		int a=sc.nextInt();
		System.out.println("Enter a number 2");
		int b=sc.nextInt();
		largest(a,b);
	}
}
