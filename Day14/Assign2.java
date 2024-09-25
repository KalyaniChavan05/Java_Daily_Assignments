import java.util.*;
class Assign2
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two integer: ");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		System.out.println("Before Swap: " +n1 + " " + n2);
		int n3= n1;

		n1 = n2;
		System.out.println("After swap: "+n2 + " "+n3);
	}
}