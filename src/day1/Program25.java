package day1;

import java.util.Scanner;

class Program25 
{
	//to find digital product.
	static int digitalProduct(int n)
	{
		int product =1;
		int count=n;
		while (count>1)
		{
			product *=count%10;
			count=count/10;
		}
		
		return product;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		System.out.println(digitalProduct(n));

	}
}
