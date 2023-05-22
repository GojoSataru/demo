package day1;
import java.util.Scanner;
class Program18 
{
	//print the number from 1 to n using for loop, while loop and do while loop
	static void numFor(int num)
	{
		for (int i=1;i<=num;i++)
		{
			System.out.println(i);
		}
	}
	static void numWhile(int num)
	{
		int i=1;
		while (i<=num)
		{
			System.out.println(i);
			i++;
		}
	}
	static void numDoWhile(int num)
	{
		int i=1;
		do
		{
			System.out.println(i);
			i++;
		}
		while (i<=num);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("For loop");
		int num = sc.nextInt();
		numFor(num);
		System.out.println("while loop");
		int num1 = sc.nextInt();
		numWhile(num1);
		System.out.println("do while loop");
		int num2 = sc.nextInt();
		numDoWhile(num2);
	}
}
