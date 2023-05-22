package day1;

import java.util.Scanner;

class Program20 
{
	//to find the sum of first n natural numbers.
	static void addUptoN(int num)
	{
		int sum=0;
		for (int i=1;i<=num;i++)
		{
			sum = sum+i;	
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nth number");
		int num = sc.nextInt();
		addUptoN(num);
	}
}
