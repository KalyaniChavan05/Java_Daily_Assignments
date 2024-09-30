import java.util.*;
class Assign3
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Current: ");
		int I = sc.nextInt();
		System.out.println("Enter Resistance : ");
		int R = sc.nextInt();
		int V = I* R;
		System.out.println("Voltage V= " +V);
	}
}