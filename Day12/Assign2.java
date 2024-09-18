/* Write a program that accpets two integers from user and prints multiplication and division of them.
[Note: checks for smaller divisor amongst entered number while computing division]
*/

import java.util.*;
class Assign2
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		System.out.println("Multiplication is "+(n1*n2));
		if(n1<n2)
		{
			System.out.println("Division is "+(n2/n1));
		}
		else
		{
			System.out.println("Division is "+(n1/n2));
		}
	}
}