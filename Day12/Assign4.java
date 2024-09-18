/*
Write a program to simulate simple calculator . Accept two integers from user and sign of operation to perform.
*/

import java.util.*;
class Assign4
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number:");
		int n1= sc.nextInt();
		System.out.println("Enter Second Number:");
		int n2= sc.nextInt();
		System.out.println("Enter sign of operation:");
		String ch= "Add";
		switch(ch)
		{
			case "Add":
				System.out.println("Addition of " +n1 + " & " + n2 + " is "+ (n1+n2));
				break;
			case "Sub":
				System.out.println("Subtraction of " +n1 + " & " + n2 + " is "+ (n1-n2));
				break;
			case "Multi":
				System.out.println("Multipliaction of " +n1 + " & " + n2 + " is "+ (n1*n2));
				break;
			case "Div":
				System.out.println("Division of " +n1 + " & " + n2 + " is "+ (n1/n2));
				break;
		}
	}
}