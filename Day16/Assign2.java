import java.util.*;
class Assign2
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Two Integers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int factorial=1;
		for(int i= num1 ; i<= num2; i++)
		{
			factorial= factorial * i;
			System.out.println("Factorial of " + i + " = " +factorial);
		}
	}
}