package day1;

import java.util.Scanner;

class Program38 
{
	//to check all arrmstrong between 1 and n.
	static void armstrongInRange(int n,int m)
	{
		for (int i=n;i<=m ;i++ )
		{
			System.out.println(i);
			int check1=i;
			int num=i;
			int count=0;
			int check=0;

			while (i > 0)
			{
				i/=10;
				count++;
			}
			System.out.println(count);
			while (num>0)
			{
				int last=num % 10;
				System.out.println("entered");
				System.out.println(last);
				int res=1;
				for (int k=1;k <=count ;k++ )
				{
					System.out.println(k);
					res*=last;
				}	
				check+=res;
				num/=10;
			}
			System.out.println("check=" + check);
			System.out.println("num=" + check1);
			
			if (check1 == check)
			{
				System.out.println(i + ", ");
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range of two numbers to check armstrong number between them ");
		System.out.println("Enter a first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter a second number: ");
		int num2 = sc.nextInt();
		armstrongInRange(num1, num2);
	}
}
