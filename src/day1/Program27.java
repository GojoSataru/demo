package day1;

import java.util.Scanner;

class Program27 
{
	//to find the digital product of even numbers in the given number
	static int digitalEvenProduct(int n)
	{
		int product=0;
		int count=n;
		while (count>1)
		{
			if ((count%10)%2==0)
			{
				product *= n%10;
			}
			count = n/10;
		}
		return product;
	}
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println(digitalEvenProduct(n));
	}
}
