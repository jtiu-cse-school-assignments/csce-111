/*

Julian Tiu
10/01/2015

*/
import java.io.*;
import java.util.Scanner;

public class JulianTiuExerciseSeventeen
{

	public static void main(String[] args) throws IOException
    {

		Scanner key = new Scanner(System.in);

		int points = 0;
        String choice;
        
        System.out.println("Welcome to the Lebron James trivia game! Let's begin: ");
        System.out.println();

		System.out.println("When did Lebron James win his first MVP award?\na. 2004-05\nb. 2006-2007\nc. 2008-09\nd. 2010-11");
		choice = key.next();
		if(choice.charAt(0) == 'c')
			points += 5;
        else
            points -= 3;

		System.out.println("At what age did Lebron James start playing in the NBA?\na. 23\nb. 20\nc. 18\nd. 19");
		choice = key.next();
		if(choice.charAt(0) == 'c')
			points += 10;
        else
            points -= 6;

		System.out.println("For what team did Lebron James win his first ring?\na. Miami Heat\nb. Houston Rockets (HTOWN BABY)\nc. Cleveland Caveliers\nd. Chicago Bulls");
		choice = key.next();
		if(choice.charAt(0) == 'a')
			points += 20;
        else
            points -= 12;

		System.out.println("From what city did Lebron James grow up in?\na. Houston (HTWON BABY)\nb. Cleveland\nc. Miami\nd. Akron");
		choice = key.next();
		if(choice.charAt(0) == 'd')
			points += 40;
        else
            points -= 24;
		System.out.println("Congratulations for finishing the Lebron James quiz. You have " + points + " points. \nYou need 50 to pass");

		key.close();

	}

}