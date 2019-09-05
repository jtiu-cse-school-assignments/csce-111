import java.util.Scanner;

/*
 *
 *Julian Tiu
 *Oct. 9, 2015
 *
 */


public class JulianTiuExerciseTwenty
{
	public static void main(String[]args)
	{
		Scanner key = new Scanner(System.in);
		String card, again;
		
		do
		{
			int draw = 1 + (int)(Math.random()*10);
		
			if(draw ==1)
				System.out.println("\nYou drew a card with a value of 1");
			else if(draw ==2)
				System.out.println("\nYou drew a card with a value of 2");
			else if(draw ==3)
				System.out.println("\nYou drew a card with a value of 3");
			else if(draw ==4)
				System.out.println("\nYou drew a card with a value of 4");
			else if(draw ==5)
				System.out.println("\nYou drew a card with a value of 5");
			else if(draw ==6)
				System.out.println("\nYou drew a card with a value of 6");
			else if(draw ==7)
				System.out.println("\nYou drew a card with a value of 7");
			else if(draw ==8)
				System.out.println("\nYou drew a card with a value of 8");
			else if(draw ==9)
				System.out.println("\nYou drew a card with a value of 9");
			else if(draw ==10)
				System.out.println("\nYou drew a card with a value of 10");
			else
				System.out.println("\nYou're playing against a mafia member, and you ended up having a bad night.");
				
				System.out.println("Draw again (y/n)?");
				again = key.next();
		} while(again.equals("y"));
		
		System.out.println("\nAdd up the value of both cards. If you ended up having more than 21, then you bust.");
		System.out.println();
	}
}

