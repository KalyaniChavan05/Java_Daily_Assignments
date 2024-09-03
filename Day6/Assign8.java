class Assign8
{
	public static void main(String args[])
	{
		int n=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=1; j<=4;j++)
			{
				if(n % 2 ==1)
				{
					System.out.print(n+" ");
					n++;
				}
			}
			System.out.println();
		}
	}
}