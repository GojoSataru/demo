package day1;

import java.util.Scanner;

class Program30
{
	//to reverse a number and store 
	static String reverseNum(int n)
	{
		int rev=0;
		int count=n;
		while (count>0)
		{
			int last = count%10;
			rev=rev*10+last;	
			count/=10;
		}
		if (rev == n)
		{
			return "Palindrome";
		}
		else
		{
			return "Not-Palindrome";
		}
	}
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println(reverseNum(n));
	}
}
