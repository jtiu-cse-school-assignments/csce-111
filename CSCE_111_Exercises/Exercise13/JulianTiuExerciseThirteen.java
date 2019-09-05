/*

 
 Julian Tiu
 10/01/2015

*/

import java.util.Scanner;

public class JulianTiuExerciseThirteen
{
    public static void main( String args[] )
    {
        
        Scanner key = new Scanner(System.in);
        
        String userResponse, userResponse2, userResponse3, userResponse4, userResponse5, userResponse6, userResponse7, userResponse8, userResponsex;
        
        System.out.println();
        
        int counter = 0;
        
        while(counter == 0) // whileloop-statement 1
        {
            System.out.println();
            System.out.println("Hey Ferb, is Candice watching us? *yes or no*");
            userResponse = key.next();
            if(userResponse.equals("yes")) //if-statement 1
            {
                
                System.out.println("*Continues to sit under the tree*");
                System.out.println("**************END****************");
                System.out.println();
                
                System.out.println("Play again?");
                userResponse2 = key.next();
                if(userResponse2.equals("yes")) //if-statement a
                {
                    
                }//end if-statement a; story starts over
                else //else statement a
                {
                    counter = 1;
                }//end else statement a; breaks the loop
                
            }//ends if-statement 1
            else //else-statement 1
            {
                System.out.println();
                System.out.println("Ferb, let's go find our friends and build a roller coaster!");
                System.out.println("The weather is hot or cold? *Enter hot or cold*");
                userResponse3 = key.next();
                if(userResponse3.equals("hot")) //if-statement 2
                {
                    System.out.println();
                    System.out.println("Lets flip a coin!");
                    System.out.println("If it's heads, let's build an Ice Box coaster.");
                    System.out.println("If it's tails, let's biuld a Log Fume coaster.");
                    System.out.println("*Flip a coin and choose heads or tails: ");
                    userResponse4 = key.next();
                    if(userResponse4.equals("tails")) //if-statement 3
                    {
                        
                        System.out.println("Let's build a Log Fume coaster that will serve us breaded fish sticks!");
                        System.out.println("Do you want the fish sticks extra crunchy or microwaved?");
                        userResponsex = key.nextLine();
                        userResponsex = key.nextLine();
                        if(userResponsex.equals("extra crunchy")) //if-statement 4
                        {
                            System.out.println("Eats extra crunchy fish sticks");
                            System.out.println("**************END*************");
                            System.out.println();
                            
                            System.out.println("Play again?");
                            userResponse5 = key.next();
                            if(userResponse5.equals("yes")) //if-statement b
                            {
                    
                            }//end if-statement b; story starts over
                            else //else statement b
                            {
                                counter = 1;
                            }//end else statement b; breaks the loop
                
                        } //end if-statement 4
                        else //else statement 4
                        {
                            System.out.println("Eats microwaved fish sticks");
                            System.out.println("************END************");
                            System.out.println();
                            System.out.println("Play again?");
                            userResponse6 = key.next();
                            if(userResponse6.equals("yes")) //if-statement c
                            {
                    
                            }//end if-statement c; story starts over
                            else //else statement c
                            {
                                counter = 1;
                            }//end else statement c; breaks the loop
                            
                        } //end else-statement 4
                        
                    }// end if-statement 3
                    else //else-statement 3
                    {
                        
                        System.out.println("Let's build an Ice Box coaster that will serve us ice cream sandwhiches!");
                        System.out.println("********************************END*************************************");
                        System.out.println();
                        System.out.println("Play again?");
                        userResponse7 = key.next();
                        if(userResponse7.equals("yes")) //if-statement d
                        {
                            
                        }//end if-statement d; story starts over
                        else //else statement d
                        {
                            counter = 1;
                        }//end else statement d; breaks the loop
                                
                    } //end else-statement 3
                    
                } //end if-statement 2
                else
                {
                    System.out.println("We will build a Pizza Oven coaster that will keep us warm!");
                    System.out.println("**************************END*****************************");
                    System.out.println();
                    System.out.println("Play again?");
                userResponse8 = key.next();
                if(userResponse8.equals("yes")) //if-statement e
                {
                    
                }//end if-statement e; story starts over
                else //else statement e
                {
                    counter = 1;
                }//end else statement e; breaks the loop
                    
                } //end else-statement 2
            } //end else-statement 1
        } //end whileloop 1
    }     
}    