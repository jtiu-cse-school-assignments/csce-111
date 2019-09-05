/*

Julian TIu
10/02/15

*/

import java.util.Scanner;
public class JulianTiuExerciseSixteen
{
    public static void main(String [] args)
    {
    
        String userResponse;
        Scanner key = new Scanner(System.in);
        System.out.println();
        System.out.println("You are in the passenger seat of a super high-tech supercar with 9 buttons.");
        System.out.println("Your driver passes out, and you need a way to stop the car.");
        System.out.println("Punch in random numbers: *If you give up and accept your fate, you can type anything you want*");
        System.out.println();
        for(int i = 0; i < 10; i++)
        {
            userResponse = key.next();
            
            if(userResponse.equalsIgnoreCase("one") || userResponse.equalsIgnoreCase("1"))
            {
                System.out.println("*PARACHUTE ACTIVATED*");
                System.out.println("Punch in random numbers: *If you give up and accept your fate, you can type 'stop'*");
            }
            else if(userResponse.equalsIgnoreCase("two") || userResponse.equalsIgnoreCase("2"))
            {
                System.out.println("*TURBO BOOST ACTIVATED*");
                System.out.println("Punch in random numbers: *If you give up and accept your fate, you can type 'stop'*");
            }
            else if(userResponse.equalsIgnoreCase("three") || userResponse.equalsIgnoreCase("3"))
            {
                System.out.println("*SEAT EJECTED* You fly off and land to safety");
                System.out.println("********************END**********************");
                break;
            }    
            else if(userResponse.equalsIgnoreCase("four") || userResponse.equalsIgnoreCase("4"))
            {
                System.out.println("*RADIO ACTIVATED*");
                System.out.println("Punch in random numbers: *If you give up and accept your fate, you can type 'stop'*");
            }
            else if(userResponse.equalsIgnoreCase("five") || userResponse.equalsIgnoreCase("5"))
            {
                System.out.println("*GPS ACTIVATED* 'on the next turn, turn left'");
                System.out.println("Punch in random numbers: *If you give up and accept your fate, you can type 'stop'*");
            }
            else if(userResponse.equalsIgnoreCase("six") || userResponse.equalsIgnoreCase("6"))
            {
                System.out.println("The car stops. You are safe!");
                System.out.println("*************END************");
                break;
            }
            else if(userResponse.equalsIgnoreCase("seven") || userResponse.equalsIgnoreCase("7"))
            {
                System.out.println("*SELF DESTRUCT ACTIVATED* You exploded");
                System.out.println("*****************END******************");
                break;
            }
            else if(userResponse.equalsIgnoreCase("eight") || userResponse.equalsIgnoreCase("8"))
            {
                System.out.println("*SPOILERS ACTIVATED*");
                System.out.println("Punch in random numbers: *If you give up and accept your fate, you can type 'stop'*");
            }
            else if(userResponse.equalsIgnoreCase("nine") || userResponse.equalsIgnoreCase("9"))
            {
                System.out.println("*THAT BUTTON IS NOT A REGISTERED ACTION*");
                System.out.println("Punch in random numbers: *If you give up and accept your fate, you can type 'stop'*");
            }
            else
            {
                System.out.println("The car doesn't stop and you fall off a cliff");
                System.out.println("*********************END*********************");
                break;
            }//end 'stop' action; breaks loop
            
            System.out.println();
        }//end for-loop        
    } //end main method
}//end class