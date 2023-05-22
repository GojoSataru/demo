package day1;

import java.util.Scanner;

class Program35
{
	//to print prime numbers between 10 and 80
	static void primeornot()
	{
		for (int i=10;i<=80;i++)
		{
			int count=0;
			for (int j=1;j<=i;j++)
			{
				if (i%j==0)
				{
					count++;
				}
			}
			if (count==2)
			{
			 System.out.print(i+", ");
			}
		}		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		System.out.print("prime numbers between 10 and 80 are: ");
		primeornot();
	}
}
