package day1;

import java.util.Scanner;

class Program29 
{
	//to reverse a number and store 
	static void reverseNum(int n)
	{
		int rev=0;
		int count=n;
		while (count>0)
		{
			int last = count%10;
			rev=rev*10+last;	
			count/=10;
		}
		System.out.println(rev);
	}
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		reverseNum(n);
		
	}
}
