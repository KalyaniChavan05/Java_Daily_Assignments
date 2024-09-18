/* 
 Write a program that accepts two integers from user and prints addition of their Cubes and subtraction of their Squares
*/

import java.util.*;
class Assign3
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		System.out.println("Addition of "+n1*n1*n1 + " & " +n2*n2*n2 + " is "+(n1*n1*n1 + n2*n2*n2));
		System.out.println("Subtraction of "+n1*n1 + " & " +n2*n2 + " is "+(n1*n1 - n2*n2));
	}
}