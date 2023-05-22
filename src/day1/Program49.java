package day1;

import java.util.Scanner;

class Program49 
{
	//to create method area (int,String)
	//where int is the size/radius
	//Srting is the shape and find area of circle and square accordingly.
	static double area(int size,String shape)
	{
		if (shape.equals("circle"))
		{
			return 3.14*size*size;
		}
		if (shape.equals("square"))
		{
			return size*size;
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size or radius");
		int r=sc.nextInt();
		System.out.println("Enter size or shape");
		String s=sc.next();
		System.out.println("The area of the "+ s.toString() +" is: "+area(r,s.toString()));
	}
}
