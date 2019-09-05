import java.util.Scanner;
import java.io.PrintStream;
import java.io.IOException;

public class CreateContact{
   
   private static boolean firstWrite = true;
   
   public static void main(String[] args) throws IOException{

       //create variables for user-information
       String FirstName;
       String LastName;
       String PhoneNumber;
       Scanner KeyboardReader = new Scanner(System.in);
       //output a CSV file
      PrintStream fileStream = new PrintStream(NameOne + NameTwo + ".csv");
      
      do{
         FirstName = getName("First", KeyboardReader);
         LastName = getName("Last", KeyboardReader);
         PhoneNumber = getNumber("10 digit Phone Number,", 10, KeyboardReader);
         write(FirstName, LastName, PhoneNumber, fileStream); 
       }while(moreContacts(KeyboardReader));
      
      KeyboardReader.close();  //close Scanner
      fileStream.close();
   } //End Main
   
   
   
   public static String getName(String Name, Scanner kbReader)
   {
      String readName = null;    
      
      while(readName == null)
      {
        System.out.println("Please type your contacts " + Name + " name, then 'enter': ");
        readName = kbReader.nextLine();
      }
      return readName;
   }// End getName
   
   
   
   public static String getNumber(String Number, int digit, Scanner kbReader)
   {
      String readNumber = null;    
      String Numbers = "0123456789";
      Boolean notNumber = false;
      
      do{
         notNumber = false;
         System.out.println("Please type your contacts " + Number + " then 'enter': ");
         readNumber = kbReader.nextLine();
      
         if((readNumber.length() < digit) || (readNumber.length() > digit))
         {
            System.out.println("I am sorry, I seem to have an incorrect number of digits.");
            System.out.println("Please type your contacts " + Number + " then 'enter': ");
            readNumber = kbReader.nextLine();                  
         }      
         else // readNumber.length() == 10
         {
          for(int i = 0; i < digit; i++)
          {
             if(!Character.isDigit(readNumber.charAt(i))) notNumber = true;
          }
         }
         if(notNumber) readNumber = null; 
      } while(readNumber == null);
      
      return readNumber;
   }// End getNumber
   
   
   
   public static void write(String NameOne, String NameTwo, String Number, PrintStream fileStream)
   {

      if(firstWrite)
      {
         fileStream.print("First Name,");
         fileStream.print("Last Name,");
         fileStream.println("Phone Number");
         firstWrite = false;
      }
      
      fileStream.print(NameOne + ",");
      fileStream.print(NameTwo + ",");
      fileStream.println(Number);
      //fileStream.println("=\"" + Number +"\""); // For an Excel only CSV file 

   }// End write
   
   public static boolean moreContacts(Scanner kbReader)
   {
      System.out.println("More contacts? (Enter y or yes)");
      String More = kbReader.nextLine();
      if((More.equalsIgnoreCase("y")) || (More.equalsIgnoreCase("yes")))
      {
         return true;
      }
      else
      {
         return false;
      }
   }// End moreContacts


   
}// End CreatContact


      