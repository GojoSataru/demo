package day1;
class Program55
{
	//to sum all elements in an array.
	public static void main(String[] args) 
	{
		int[] arr={1,2,3,4,5};
		int sum=0;
		for (int i = 0;i < arr.length ;i++ )
		{
			sum+=arr[i];
		}
		System.out.print(sum);
	}
}
