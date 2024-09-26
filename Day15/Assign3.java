/* Write a program to calculate Velocity of particle in the space having Distance and Time Entered by user */

import java.util.*;
class Assign3
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Distance: ");
		int distance= sc.nextInt();
		System.out.print("Time: ");
		int time= sc.nextInt();
		int velocity;
		velocity = distance / time ;
		System.out.println("The velocity of Particle roaming In space is " + velocity);

	}
}
