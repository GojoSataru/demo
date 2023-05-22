package day1;

import java.util.Scanner;

class  Program13
{

	//to find smallest of two numbers using conditiona operator.
	static int small(int num1,int num2)
	{
		int small = num1 < num2? num1:num2;
		return small;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		System.out.println("The minimum number is: " + small(num1,num2));
	}
}
