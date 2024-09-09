class Assign1
{
	public static void main(String args[])
	{
		for(int i=0; i<4; i++)
		{
			int n= 7-i;
			for(int j=0; j<=i; j++)
			{
				System.out.print(n+ " ");
				n--;
			}
			System.out.println();
		}		
	}
}