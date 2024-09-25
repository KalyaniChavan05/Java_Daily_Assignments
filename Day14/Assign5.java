import java.util.*;
class Assign5
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two integer: ");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		int n3;
		if(n1>n2)
		{
			n3= n1;
		}
		else
		{
			n3= n2;
		}
		System.out.println("Maximum number amongst " + n1 + " & " + n2 + " is " + n3);
	}
}
