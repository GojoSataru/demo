package day1;
 
import java.util.Scanner;

class Program6
{
	//6.to check whether the person is elidgible for marrige or not 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		
		if (age > 21)
		{
		System.out.println("Elidgible for marrige");
		}
		else
		{
			System.out.println("Not elidgible for marrige");
		}
	}
}