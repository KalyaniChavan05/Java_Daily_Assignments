/* Write a program that accpets two integers from user and prints Addition and Subtraction of them
[Note: checks for greater number to subtracts with while subtracting numbers]
*/

import java.util.*;
class Assign1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("Addition is " +(n1+n2));
		if(n1>n2)
		{
			System.out.println("Subtraction is "+(n1-n2));
		}
		else
		{
			System.out.println("Subtraction is "+(n2-n1));
		}
	}
}