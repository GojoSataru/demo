package day1;

import java.util.Scanner;

class Program47 
{
	static void swap(int num1,int num2)
	{
		int a=num1;
		int b=num2;
		int temp=num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1=" + num1 +"	 num2="+  num2);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number 1");
		int num1=sc.nextInt();
		System.out.println("Enter a number 2");
		int num2=sc.nextInt();
		swap(num1,num2);
	}
}
