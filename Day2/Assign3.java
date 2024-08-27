class Assign3
 {
	public static void main(String[] args)
	 {
		System.out.println("Numbers between 1 and 20 divisible by both 3 and 7 are");
       		 for(int num = 1;  num <= 20;  num++)
		 {
            		if (num % 3 == 0 && num % 7 == 0)
			 {
             			   System.out.print(num + " ");
            		}
        	}
    	}
}
