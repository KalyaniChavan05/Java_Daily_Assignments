/* Write a program that accepts three integers from user and prints maximum number from them */

import java.util.*;
class Assign5
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter three integers: ");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		int n3= sc.nextInt();
		int n4= 0;
		if(n1 > n2 && n1>n3)
		{
			n4= n1;
		}
		else if( n2 > n1 && n2>n3)
		{
			n4= n2;
		}
		else
		{
			n4= n3;
		}
		System.out.println("The maximum number amongst " + n1 + " , " + n2 +  " & " + n3 + " is " + n4);
	}	
}