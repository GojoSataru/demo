package day1;
class  Demo
{
	/*static void power(int num,int power)
	{
		int res=num;
		int m;
		int p=power;
		while (p>1)
		{
			res*=num;
			p--;
		}
		System.out.println(res);
	}*/
	static void reverse(int n)
	{
		int rev;
		int num=n;
		while (num>0)
		{
			rev=(num%10);
			num/=10;
		}
		
	}
	public static void main(String[] args) 
	{		
		//power(3,3);
		reverse(1234);
	}
}
