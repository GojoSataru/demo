package day1;

import java.util.Scanner;

class Prog_1
{
	static void valid( String month)
	{
		switch (month)
		{
		case "january":
			System.out.println("Valid month");
			break;
		case "february":
			System.out.println("Valid month");
			break;
		case "march" :
			System.out.println("Valid month");
			break;
		case "june" :
			System.out.println("Valid month");
			break;
		case "july" :
			System.out.println("Valid month");
			break;
		case "august" :
			System.out.println("Valid month");
			break;
		case "saptempber" :
			System.out.println("Valid month");
			break;
		case "auctomber" :
			System.out.println("Valid month");
			break;
		case "november" :
			System.out.println("Valid month");
			break;
		case "december" :
			System.out.println("Valid month");
		break;		
		default:
		System.out.println("Not a valid month");
		
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the month: ");
		String month = sc.next();		
		valid(month);
	}
}