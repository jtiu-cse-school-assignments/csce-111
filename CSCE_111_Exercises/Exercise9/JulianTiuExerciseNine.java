/*
 * Julian Tiu
 * 09/25/15
 */
import java.util.Scanner;

public class JulianTiuExerciseNine
{
   public static void main( String[] args )
   {

      Scanner key = new Scanner(System.in);
      System.out.println("******************************************************************");
      System.out.println();
      System.out.println("Make your own story! Just fill in the blanks!");
      System.out.println("If it asks for words, please do put in words. The same goes for numbers (whole numbers please).");
      System.out.println();
      
      System.out.println("Enter a type of clothing: ");
      String clothing = key.next();
      
      System.out.println("Enter an adjetive: ");
      String adjective = key.next();
      
      System.out.println("Enter another adjective: ");
      String adjective2 = key.next();
      
      System.out.println("Enter any type of liquid");
      String liquid = key.next();
      
      System.out.println("Enter a verb with an -ing ending: ");
      String verbEndingInIng = key.next();
      key.nextLine();
      
      System.out.println("Enter your teacher's name: ");
      String teacher = key.nextLine();
      
      System.out.println("Enter your school name: ");
      String school = key.nextLine();
      
      System.out.println("Enter a plural noun: ");
      String pluralNoun = key.next();
      
      System.out.println("Enter a verb: ");
      String verb = key.next();
      
      System.out.println("Enter a singular noun: ");
      String singNoun = key.next();
      
      System.out.println("Enter another singular noun: ");
      String singNoun2 = key.next();
      
      System.out.println("Enter a musical instrument: ");
      String mInstrument = key.next();
      
      System.out.println("Enter a number: ");
      int numObject = key.nextInt();
      System.out.println();
    
      System.out.println();
      System.out.println("Here is a great way to spend a winter day. First, put on a nice warm " + clothing + ".");
      System.out.println("You want to be sure you stay warm and " + adjective + ".");
      System.out.println("Next, fill a thermos full of hot steamy " + liquid + ".");
      System.out.println("Now you are ready to go snow " + verbEndingInIng + ".");
      System.out.println();
      System.out.println("Some people say only experts should go snow " + verbEndingInIng + ", ");
      System.out.print("but I think anyone can do it if you use a little common sense.");
      System.out.println(" I have heard a rumor that " + teacher + " will be offering special snow " + verbEndingInIng);
      System.out.print("classes after school at " + school + ", " + "but I don't know if that's true.");
      System.out.println();
      System.out.println("The best place to go snow " + verbEndingInIng + " is on a hill that is covered with snow.");
      System.out.println("First you will want to clear away any leaves and " + numObject + " " + pluralNoun + ".");
      System.out.println("Stand at the top of the hill and shout, 'Hey, everybody, " + verb + " out below!'");
      System.out.println("Then step onto a(n) " + singNoun + ", point yourself downhill, and off you go.");
      System.out.println();
      System.out.println("Snow " + verbEndingInIng + "is fun, healthy, and " + adjective2 +"."); 
      System.out.print("And here is one more tip: everyone will be especially impressed if you can balance a(n) " + singNoun2);
      System.out.print(" on your head or play a(n) guitar as you sail by.");
      System.out.println();
      System.out.println("*****************************************************************");
      System.out.println();
    
       
    }
}