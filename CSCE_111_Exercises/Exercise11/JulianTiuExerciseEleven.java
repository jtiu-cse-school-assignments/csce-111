/*
 
 Based on the Math.random method, you may have different
 scenarios. Also, at the end it will ask you if you want to play again.
 
 Julian Tiu
 09/29/2015

*/

import java.util.Scanner;

public class JulianTiuExerciseEleven
{
    public static void main( String args[] )
    {
        
        Scanner key = new Scanner(System.in);
        
        String userResponse, userResponse2, userResponse3;
        
        System.out.println();
        System.out.println("The following will allow you to enter 'yes' or 'no': ");
        System.out.println();
        
        int counter = 0;
        
        while(counter == 0)
        {
            
            System.out.println("**Your 25th high school reunion is coming up!**");
            System.out.println("Would you like to attend?");
            userResponse = key.next();
            
            if(userResponse.equals("yes"))
            {
                System.out.println();
                System.out.println("You think back at the 'incident' that occured in your highschool prom as you drive to the venue.");
                System.out.println("You get to the venue, and: ");
                int x = (int)(Math.random()*2)+1;
                if(x == 1)
                {
                    System.out.println("Your old friends remember the incident and laugh at you.");
                    System.out.println("Do you want to destroy them?");
                    userResponse2 = key.next();
                    if(userResponse2.equals("yes"))
                    {
                        System.out.println();
                        System.out.println("You used your raygun, and they're all dead.");
                        System.out.println("********************END********************");
                        System.out.println("Do you want to play again?");
                        userResponse3 = key.next();
                        if (userResponse3.equals("yes")) //loops the game
                        {
                            
                        }
                        else // ends the game
                        {
                            System.out.println("End game");
                            counter = 1;
                        }
                    }
                    else
                    {
                        System.out.println();
                        System.out.println("Respect. You chose to be the better person. Go enjoy your time!");
                        System.out.println("******************************END******************************");
                        System.out.println("Do you want to play again?");
                        userResponse3 = key.next();
                        if (userResponse3.equals("yes")) //loops the game
                        {

                        }
                        else //ends the game
                        {
                            System.out.println("End game");
                            counter = 1;
                        }
                    }
                }
                else
                {
                    System.out.println();
                    System.out.println("Your friends treat you with respect. Have a great time!");
                    System.out.println("*************************END***************************");
                    System.out.println("Do you want to play again?");
                    userResponse3 = key.next();
                    if (userResponse3.equals("yes")) //loops the game
                    {

                    }   
                    else //ends the game
                    {
                        System.out.println("End game");
                        counter = 1;
                    }
                }
            }
            else
            {
                System.out.println();
                System.out.println("Wise decision. Go ahead and enjoy your coffee.");
                System.out.println("********************END***********************");
                System.out.println("Do you want to play again?");
                userResponse3 = key.next();
                if (userResponse3.equals("yes")) //loops the game
                {

                        
                }
                else //ends the game
                {
                        System.out.println("End game");
                        counter = 1;
                }
            }
        }
    }     
}    