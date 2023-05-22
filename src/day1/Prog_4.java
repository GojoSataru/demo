package day1;

import java.util.Scanner;

class Prog_4
{
	static void leap(int year)
	{
		if (year % 4 == 0)
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
				{
					System.out.println(year + " is a leap year");
				}
				else
				{
					System.out.println(year + "Not a leap year");
				}
			}
		}
		else
		{
			System.out.println(year + " Not a leap year");
		}
	}
	//4. to check whetther the given year is leap  year or not. (366 days in a year )
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = sc.nextInt();

		leap(year);
	}
}