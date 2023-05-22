package day1;

import java.util.Scanner;

class Program12
{
	static void result(int math, int english,int physics,int chemistrys)
	{
		int marks = math + english + physics + chemistry;
		int percentage = (marks/400)*100;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter marks of Math :");
		int math = sc.nextInt();
		System.out.println("Enter marks of English :");
		int english = sc.nextInt();
		System.out.println("Enter marks of physics :");
		int physics = sc.nextInt();
		System.out.println("Enter marks of chemistry :");
		int chemistry = sc.nextInt();

		result(math,english,physics,chemistry);
	}
}
