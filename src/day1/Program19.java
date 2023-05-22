package day1;

import java.util.Scanner;

class Program19
{
	//print the number from n to 1 using for loop, while loop and do while loop
	static void numFor(int num)
	{
		for (int i=num;i>=1;i--)
		{
			System.out.println(i);
		}
	}
	static void numWhile(int num)
	{
		int i=num;
		while (i>=1)
		{
			System.out.println(i);
			i--;
		}
	}
	static void numDoWhile(int num)
	{
		int i=num;
		do
		{
			System.out.println(i);
			i--;
		}
		while (i>=1);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("For loop");
		int num = sc.nextInt();
		numFor(num);
		System.out.println("while loop");
		int num1 = sc.nextInt();
		numWhile(num1);
		System.out.println("do while loop");
		int num2 = sc.nextInt();
		numDoWhile(num2);
	}
}
