class Assign3
{
	public static void main(String args[])
	{	
		for(int i=0; i<=4; i++ )
		{
			char ch= 'A';
			char ch1= 'a' ;

			for(int j=1; j<=4-i ; j++)
			{		
				if(i % 2 ==0)
				{
					System.out.print(ch+ "   ");
					ch++;
				}
				else
				{
					System.out.print(ch1+ "   ");
					ch1++;
				}	
			}
			System.out.println();
		}
	}
}