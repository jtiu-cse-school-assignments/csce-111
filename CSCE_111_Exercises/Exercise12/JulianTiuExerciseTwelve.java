/*
 
 Julian Tiu
 09/30/2015

*/

import java.util.Scanner;

public class JulianTiuExerciseTwelve
{
    public static void main( String args[] )
    {
        
        Scanner key = new Scanner(System.in);
        
        String userResponse, userResponse2, userResponse3, userResponse4; 
        
        System.out.println();
        System.out.println("*Scene*");
        System.out.println("You are in first place during the last lap in a NASCAR race: ");
        System.out.println();
        
        System.out.println("The fisrt turn comes: turn right or left?");
        userResponse = key.next();
        if(userResponse.equals("left"))
        {
            System.out.println("You avoided collision!");
            System.out.println("The second turn comes: turn right or left?");
            userResponse2 = key.next();
            if(userResponse2.equals("left"))
            {
                System.out.println("You avoided collision!");
                System.out.println("The third turn comes: turn right or left?");
                userResponse3 = key.next();
                if(userResponse3.equals("left"))
                {
                    System.out.println("You avoided collision!");
                    System.out.println("The last turn comes: turn right or left?");
                    userResponse4 = key.next();
                    if(userResponse4.equals("left"))
                    {
                        System.out.println("The best victory in NASCAR history!");
                    }
                    else
                    {
                        System.out.println("The worst defeat in NASCAR history! Your career is over.");
                        System.out.println("*************************END****************************");
                    }
                }
                else
                {
                    System.out.println("The wall nudges you to last place. Your career is worthless now.");
                    System.out.println("****************************END*********************************");
                }
            }
            else
            {
                System.out.println("You crashed into the barrier. Your career is over.");
                System.out.println("*********************END**************************");
            }
        }
        else
        {
            System.out.println("You slammed into the wall. Your career is over.");
            System.out.println("**********************END**********************");
        }
        
    }     
}    