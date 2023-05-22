package day1;

import java.util.Scanner;

class Program28 
{
	//to reverse a number
	static void reverseNum(int n)
	{
		int count=n;
		while (count>0)
		{
			int last = count%10;
			System.out.print(last);
			count/=10;
		}

	}
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		reverseNum(n);
		
	}
}
