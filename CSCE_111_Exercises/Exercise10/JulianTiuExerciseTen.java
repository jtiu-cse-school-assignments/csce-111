/*
 *
It's all a cycle. One big giant cycle. Calendar dates... moon phases... leap years...
In math, f(x) = sin(x) also produces a cycle of 1, 0, and -1.
This is called the sine period.
The natural period of the sine curve is 2Pi.

Instead of calculating the day of a given year, this program allows the user to input
any angle in degrees to calculate what f(x) value it would be in the sin period cycle.

Julian Tiu
09/25/2015

*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class JulianTiuExerciseTen
{
    public static void main( String args[] )
    {
    
        Scanner key = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter an angle in degrees that corresponds to 0, Pi/2, Pi, 3Pi/2, 2Pi");
        System.out.println("For example, the value 2pi could be converted to 0 degrees, 360 degrees, 720 degrees... etc.");
        int degs = key.nextInt();
        
        double newDegs = (Math.sin((degs*Math.PI)/180));
        DecimalFormat df = new DecimalFormat("0.00");
        String newDegs2 = df.format(newDegs);
        System.out.println("In that point, f(x) is at " + newDegs2);
        System.out.println("If that value does not equal 1, 0, -1, or -0, then the angle you entered is not equal to 0, Pi/2, Pi, 3Pi/2, or 2Pi.");
        
        
        /*
        if (newDegs2 == "-1.00")
        {
            System.out.println("In that point, f(x) is at -1");
        }
        if(df.format(newDegs) == "0.00")
        {
            System.out.println("In that point, f(x) is at 0");
        }
        if(newDegs2 == "1.00")
        {
            System.out.println("In that point, f(x) is at 1");
        }
        else if(newDegs2 != "-1.00" && newDegs2 != "1.00" && newDegs2 != "0.00")
        {
            System.out.println("That angle does not equal to 0, Pi/2, Pi, 3Pi/2, and/or 2Pi, but f(x) would be at " + newDegs2);
        }
        */
        
    
    }
    
}    