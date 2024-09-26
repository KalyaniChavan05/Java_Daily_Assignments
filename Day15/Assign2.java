/* Write a program that accepts two integers from user and prints minimum number from them */

import java.util.*;
class Assign2
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two integers: ");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		int n3= 0;
		if(n1 < n2)
		{
			n3= n1;
		}
		else
		{
			n3= n2;
		}
		System.out.println("The minimum number amongst " + n1 + " & " + n2 + " is " + n3);
	}	
}