package day1;

import java.util.Scanner;

class  Program15
{

	//to find smallest of four numbers using cindtional operator and method.
	static int small(int a,int b,int c,int d)
	{

		int small1 = a<b?a:b;
		int small2 = c<d?c:d;
		int small = small1<small2?small1:small2;
		return small;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter the Third number: ");
		int num3 = sc.nextInt();
		System.out.println("Enter the Fourth number: ");
		int num4 = sc.nextInt();
		System.out.println("The smallest number is: " + small(num1,num2,num3,num4));
	}
}
