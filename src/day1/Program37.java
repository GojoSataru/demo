package day1;
import java.util.Scanner;
class Program37 
{
	//to check given no is armstrong or not.
	static void armstrong(int num)
	{
		int n=num;
		int check2=num;
		int count=0;
		int check=0;

		while (num>0)
		{
			num/=10;
			count++;		
		}
		while (n>0)
		{
			int last=n%10;
			//System.out.println(last);
			int res=1;
			for (int i = 1; i<= count  ; i++ )
			{
				res *= last ;r
			}
			check += res;
			n/=10;
		} 
		//System.out.println("check=" + check);
		//System.out.println("num=" + check2);
		if (check2 == check)	
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not-Armstrong number");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check armstrong or not ");
		int n = sc.nextInt();
		armstrong(n);
	}
}
