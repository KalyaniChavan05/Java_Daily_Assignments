import java.util.*;
class Assign1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Min of Series: ");
		int min= sc.nextInt();
		System.out.println("Max of Series: ");
		int max= sc.nextInt();
		System.out.println("Series of Odd Numbers Ranging between "+ min + "& " + max + " is");
		for(int i = min; i<= max; i++)
		{
			if(i % 2 == 1)	
			{
				System.out.print(i + ", ");
			}
		}
	}
}
