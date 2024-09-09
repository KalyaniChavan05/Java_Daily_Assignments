class Assign4
{
	public static void main(String args[])
	{
		for( int i=1; i<=4; i++)
		{
			int n=5;
			for(int j=0; j<=4-i; j++)
			{
				System.out.print(n+ " ");
				n--;
			}
			System.out.println();
		}
	}
}