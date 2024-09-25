import java.util.*;
class Assign3
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  integer: ");
		int n1= sc.nextInt();

		for(int i= 1; i<= n1; i++)
		{
			if(i % 2 ==0)
			{
				System.out.println("Cube of "+ i + ": " + i*i*i + " and" + " Square of " + i + " :" + i*i);
			}

		}
	}
}
