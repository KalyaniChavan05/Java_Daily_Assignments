// Write a program to take input length and breadth of rectangle  and calculate its area.

import java.util.*;
class Assign3
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Breadth : ");
		int b = sc.nextInt();
		System.out.println("Enter Length: ");
		int l = sc.nextInt();
		int Area = b * l;
		System.out.println("Area of rectangle : " + Area);
	}
}