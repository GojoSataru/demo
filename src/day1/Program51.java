package day1;

import java.util.Scanner;

class Program51 
{
	static void smallest(int a,int b,int c)
	{
		if (a<b && a<c)
		{
			System.out.println(a +" is smallest.");
		}
		else if (b<c)
		{
			System.out.println(b +" is smallest.");
		}
		else
		{
			System.out.println(c +" is smallest.");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number 1");
		int a=sc.nextInt();
		System.out.println("Enter a number 2");
		int b=sc.nextInt();
		System.out.println("Enter a number 3");
		int c=sc.nextInt();
		smallest(a,b,c);
	}
}
