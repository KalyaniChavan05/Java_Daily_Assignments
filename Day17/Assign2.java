// Write a program that accepts an integer from user and prints its second successor and second predecessor.

import java.util.*;
class Assign2
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num1 = sc.nextInt();
		int num2= num1-2;
		System.out.println("Second Predecessor: " + num2);
		int num3= num1+2;
		System.out.println("Second Successor: " + num3);
	}
}