class Assign5
{
	public static void main(String args[])
	{
		for( int i=0 ; i<=3; i++)
		{
			for(int j=1; j<=4; j++)
			{
				if( j % 2 ==1)
				{
					System.out.print(1+" ");
				}
				else
				{
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}
	}
}