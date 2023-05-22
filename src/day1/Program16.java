package day1;

import java.util.Scanner;

class  Program16
{

	/*to to print 
	a. hi if number is devisible by 3
	b. bye if nimber id devisible by 5.
	c. hibye 
	d. number in rest in the cases*/
	static void hiBye(int num)
	{
		for (int i=1;i<=num ;i++)
		{
			if (i%3==0 && i%5==0)
			{
				System.out.println("hiBye");
			}
			else if (i % 3 == 0)
			{
				System.out.println("hi");
			}
			else if (i%5==0)
			{
				System.out.println("bye");
			}
			else
			{
			System.out.println(i);
			}
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter  number: ");
		int num = sc.nextInt();
		hiBye(num);
		
	}
}
