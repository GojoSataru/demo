package day1;

import java.util.Scanner;

class Program8
{
	//to calculate simpleInterest (P,R,T by user).
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter a Principle amount :");
		int p = sc.nextInt();
		System.out.println("Enter a Rate :");
		int r = sc.nextInt();
		System.out.println("Enter a Time :");
		int t = sc.nextInt();
		
		float si= (p*r*t)/100;
		System.out.println("simpleInterest is " + si);	
	}
}