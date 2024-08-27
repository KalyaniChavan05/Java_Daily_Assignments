class Assign5
{
	public static void main(String[] args)
	 {
		System.out.println("Numbers between 1 and 20 divisible by both 3 and 7 are");
       		 int num = 1;  
		while( num <=20)
		 {
            		if (num % 3 == 0 && num % 7 == 0)
			 {
             			   System.out.print(num + " ");
            		}
			num++;
        	}
    	}
}
