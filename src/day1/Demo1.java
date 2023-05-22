package day1;

import java.util.Scanner;

class Demo1 
{
	//to check all arrmstrong between 1 and n.
	static void armstrongInRange(int num1,int num2)
	{
		for (int i=num1;i<=num2;i++ )
		{
		int n=num1;
		int check2=num1;
		int count=0;
		int check=0;

		while (num1>0)
		{
			num1/=10;
			count++;		
		}
		while (n>0)
		{
			int last=n%10;
			//System.out.println(last);
			int res=1;
			for (int k = 1; k <= count ; i++ )
			{
				res *= last ;
			}
			check += res;
			n/=10;
		} 
		//System.out.println("check=" + check);
		//System.out.println("num=" + check2);
		if (check2 == check)	
		{
			System.out.println(i);
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
