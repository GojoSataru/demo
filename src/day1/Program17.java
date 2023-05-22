package day1;

import java.util.Scanner;

class  Program17
{

	/*to check how much tax to be paid for the according to the price of the car 
	a. < 500000 = 5%
	b. 500000~100000 = 10%
	c. 100000 = 20%
	*/
	static double tax(double price)
	{
		double amt;
		if (price <= 500000)
		{
			amt = (price*5)/100;
			System.out.print("5% tax need to pay: ");
		}
		else if (price >= 500000 && price <= 1000000)
		{
			amt = (10/price)*100;
			System.out.print("10% tax need to pay: ");
			
		}
		else
		{
			amt = (20/price)*100;	
			System.out.print("20% tax need to pay: ");
			
		}
		System.out.print(amt);
		return amt;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the price: ");
		double price = sc.nextDouble();
		 double result = tax(price);
		 System.out.println(result);
	}
}
