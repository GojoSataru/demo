package day1;

import java.util.Scanner;
class Program1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the month: ");
		String month = sc.next();
		
		/*if (input == "january" || "february" || "march" || "epril" || "may" || "june" || "july" || "auguast" || "saptember" || "auctomber" || "november" || "december")
		{
			System.out.println("It is a valid month");
		}*/
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
}