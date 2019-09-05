/*=========
I just modified my code from exercise 8

Julian Tiu
09/25/15
 *=========*/

import java.util.Scanner;

public class JulianTiuExerciseFourteen
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
        
        if(max < 185)
            System.out.println("Your max is as much as an average high school student");
        else if (max <= 225)
            System.out.println("Two plates in each side doesn't even look strong enough");
        else if(max <= 275 && max < 315)
            System.out.println("You're not quite yet a bro");
        else if(max >= 315)
            System.out.println("Now we're talkin', bro!");
        
    }
}