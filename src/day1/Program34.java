package day1;

import java.util.Scanner;

class Program34
{
	//to check given number is prime number or not 
	static void primeornot(int n)
	{
		int count = 0;
		for (int i=1;i<=n;i++)
		{
		if (n%i==0)
		{
			count++;
		}
		
		}
		if (count == 2)
		{
			System.out.println("prime number");
		}
		else
			{
				System.out.println("not prime number");
			}
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		primeornot(n);
	}
}
