/*
Write a program to print following pattern
*
*  *
*  *  *
*  *  *  *

*/

class Assign5
{
	public static void main(String args[])
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}