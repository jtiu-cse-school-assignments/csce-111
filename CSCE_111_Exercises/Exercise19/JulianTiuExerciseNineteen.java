/*
	Julian Tiu
	Oct. 9, 2015
*/

import java.util.Scanner;

public class JulianTiuExerciseNineteen
{
	public static void main(String[] args)
	{
		
		Scanner key = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Would you like to rent a movie? *yes* or *no*");
		String userIn = key.next();
		
		//Evaluates if user wants to rent a movie or not
		if(userIn.equalsIgnoreCase("yes"))
		{
			System.out.println();
			System.out.println("Movie 1");
			System.out.println("Movie 2");
			System.out.println("Movie 3");
			System.out.println();
			System.out.println("Pick movie: ");
			String userIn2 = key.nextLine();
			userIn2 = key.nextLine();
			
			//Evaluates which movie the user picks
			if(userIn2.equalsIgnoreCase("Movie 1") || userIn2.equalsIgnoreCase("Movie One"))
			{
				System.out.println("You have chosen movie 1");
				System.out.println("Thank you for visiting");
			}
			else if(userIn2.equalsIgnoreCase("Movie 2") || userIn2.equalsIgnoreCase("Movie Two"))
			{
				System.out.println("You have chosen movie 2");
				System.out.println("Thank you for visiting");
			}
			else if(userIn2.equalsIgnoreCase("Movie 3") || userIn2.equalsIgnoreCase("Movie Three"))
			{
				System.out.println("You have chosen movie 3");
				System.out.println("Thank you for visiting");
			}
			else
			{
				System.out.println("Thank you for visiting");
			} //Ends evaluation for movie
		}
		else
		{
			System.out.println();
			System.out.println("Thank you for visiting");
		}//Ends evaluation if user wants to rent a movie or not
	}
}	