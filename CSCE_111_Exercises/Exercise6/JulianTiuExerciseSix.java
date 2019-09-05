/*************************************************************************

Name: Julian Tiu

Date: September 22, 2015

What do you do when you're given two vectors, and you're asked to find the angle between those two? You cannot
use the Pythagorean Theroem since the vectors do not form a 90 degree triangle. This program will allow you
to calculate for the angle! Specifically, we will use the dot product formula... but we will go beyond the
dot product formula, because someone already submitted the dot product formula. Really, it's a formula
that uses the dot product formula, within its formula. My only reference is the Java Math API. 

 *************************************************************************/
import java.util.Scanner;

public class JulianTiuExerciseSix
{
   public static void main(String[] args)
   {
      
       Scanner key = new Scanner(System.in);
       
       System.out.println("Enter your first i value. Note that this is an integer: ");
       int iValue1 = key.nextInt();
       
       System.out.println("Enter your first j value. Note that this is an integer: ");
       int jValue1 = key.nextInt();
       
       System.out.println("Enter your second i value. Note that this is an integer: ");
       int iValue2 = key.nextInt();
       
       System.out.println("Enter your second j value. Note that this is an integer: ");
       int jValue2 = key.nextInt();
       
       System.out.println("Your two vectors are < " + iValue1 + ", " + jValue1 + " >" );
       System.out.print("and < " + iValue2 + ", " + jValue2 + " >");
       
       
       int dotProd = 0;
       double magA = 0;
       double magB = 0;
       double angleOfVec = 0;
       double deg = 0;
       
       dotProd = ((iValue1)*(iValue2)) + ((jValue1)*(jValue2));
       magA = Math.sqrt( (Math.pow(iValue1, 2)) + (Math.pow(jValue1, 2)) );
       magB = Math.sqrt( (Math.pow(iValue2, 2)) + (Math.pow(jValue2, 2)) );
       deg = (dotProd)/(magA*magB);
       angleOfVec = (180*Math.acos(deg))/Math.PI;
       
       
       
       System.out.println(" ");
       System.out.println("The dot product of your two vectors is " + dotProd);
       System.out.println("The magnitude of your first vector is " + magA);
       System.out.println("The magnitude of your second vector is " + magB);
       System.out.println("The angle between the two vectors is " + angleOfVec);
       
       

   }
}