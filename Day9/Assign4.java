class Assign4
{
	public static void main(String args[])
	{	
		for(int i=0; i<=4; i++ )
		{
			char ch= 'A';
			for(int j=1; j<=4-i ; j++)
			{		
				System.out.print(ch+ "    ");
				ch++;
			}
			System.out.println();
			System.out.println();
		}
	}
}