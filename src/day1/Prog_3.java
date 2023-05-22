package day1;

import java.util.Scanner;

class Prog_3
{
	static void days(int month)
	{
		switch (month)
		{
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30");
			break;
		case 1:
		case 3:
		case 5:
		case 8:
		case 7:
		case 10:
		case 12:
			System.out.println("31");
			break;
		case 2:
			System.out.println("28");
			break;
		default:
			System.out.println("Enter a valid month");
					
		}
	}
	//3.Print the number of days in the given month.
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month snumber: ");
		int month = sc.nextInt();		
		days(month);
	}
}