package day1;
class Program56
{
	//to find average of all elements in given array.
	public static void main(String[] args) 
	{
		int[] arr={1,2,3,4,5};
		int sum=0;
		int average=0;
		for (int i = 0;i < arr.length ;i++ )
		{
			sum+=arr[i];
		}
		average = sum/arr.length;
		System.out.print("Average is: " + average);
	}
}
