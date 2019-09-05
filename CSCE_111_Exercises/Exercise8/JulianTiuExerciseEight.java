/*=============================================================================
> Speaking of fitness, when I want to know my One Rep Max (1RM for short) and I don't have a spotter
> just incase I fail miserably, I can choose to do a lighter weight with
> higher repetitions and do some math to figure it out. Thankfully, this program will allow you to only
> input that lighter weight as well as the repetitions, then poof... behold your 1RM.

Julian Tiu
09/25/15
 *===========================================================================*/

import java.util.Scanner;

public class JulianTiuExerciseEight
{
    public static void main( String[] args )
    {

        Scanner key = new Scanner(System.in);
        
        System.out.println("Input your lighter weight in lbs: ");
        int weight = key.nextInt();
        
        System.out.println("Input the number of reps you did that weight for: ");
        int reps = key.nextInt();
        
        double max = (weight*reps*.033) + weight;
        System.out.println("Your 1RM is " + max + " lbs.");
        
    }
}