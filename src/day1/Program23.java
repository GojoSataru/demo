package day1;

import java.util.Scanner;

class Program23 
{
	//to find power of n
	static int powerOfN(int n,int p)
	{
		int res =1;
		for (int i=1;i<=p;i++)
		{
			res*=n;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nth number");
		int n = sc.nextInt();
		System.out.println("Enter power");
		int p = sc.nextInt();
		System.out.println(powerOfN(n,p));

	}
}
