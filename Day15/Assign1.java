/* Write a program to print series of Even numbers ranging betw   een two numbers entered by user */

import java.util.*;
class Assign1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Min of Series:");
		int min= sc.nextInt();
		System.out.println("Max of Series:");
		int max= sc.nextInt();
		System.out.println("Series of Even Numbers Ranging between " + min + " & " + max + " is: " );
		for(int i= min; i<= max; i++)
		{
			if(i % 2== 0)
			{
				System.out.print(i+ " ,");
			}
		}
	}
}