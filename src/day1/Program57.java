package day1;
class Program57
{
	//to find the duplicate element in the given array.
	//to find the maxumum and munimum element in the array
	//find 2nd maximum and 2nd minimum elements from an array
	public static void main(String[] args) 
	{
		int[] arr={1,2,3,4,5,1};
		for (int i = 0;i < arr.length ;i++ )
		{
			for (int j =1;j < arr.length ;j++ )
			{
				if (arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		
		}
		
	}
}
