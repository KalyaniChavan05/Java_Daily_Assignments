/*  Write a Program to Print following Pattern

3
2	3
1	2	3
0	1	2	3   
*/

class Assign4
{
	public static void main(String args[])
	{
		for(int i=3; i>=0; i--)
		{
			for(int j=i; j<=3 ; j++)		
			{
				System.out.print(j + "  ");
			}
			System.out.println();
		}
	}
}
