package day1;

import java.util.Scanner;

class Prog_5
{
	static void evenOdd(int num)
	{
		if (num % 2== 0)
		{
			System.out.println(num + ": is Even Number");
		}
		else
		{
			System.out.println(num + ": is Odd number");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter a number");
		int num = sc.nextInt();

		evenOdd(num);
	}
}