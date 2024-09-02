class Assign2
{
	public static void main(String args[])
	{
		int a= 20;
		int b= 30;
		int c= 40;
		if( a <=b && a<=c )
		{
			System.out.println(a+ " is the Smallest number" );
		}
		else if( b <=a && b<=c )
		{
			System.out.println(b+ " is the Smallest number");
		}
		else
		{
			System.out.println(c+ " is the Smallest number among all numbers");
		}
	}
}
