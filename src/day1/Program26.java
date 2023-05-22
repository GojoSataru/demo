package day1;

import java.util.Scanner;

class Program26
{
	//to find digital sum of even numbers only in the even numbers.
	static int digitalEvenSum(int n)
	{
		int product =0;
		int count=n;
		while (count>1)
		{
			if ((count%10)%2==0)
			{
				product+=count%10;
			}
			
			count=count/10;
		}
		
		return product;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		System.out.println(digitalEvenSum(n));

	}
}
