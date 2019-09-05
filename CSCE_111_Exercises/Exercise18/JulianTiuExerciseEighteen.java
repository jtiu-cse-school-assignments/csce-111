/*
    
    Julian Tiu
    Oct. 9, 2015
    
*/

import java.util.Scanner;

public class JulianTiuExerciseEighteen
{
    public static void main( String[] args ) 
    {
        
        Scanner key = new Scanner(System.in);
        int upCounter = 0;
        int digCounter = 0;
        
        System.out.println("\nPassword Criteria: \n* Must be between 8 to 12 characters long \n* Must contain at least one CAPITAL letter \n* Must contain at least one number");
        System.out.println("\nEnter your password to check if it is a valid password: ");
        System.out.println();
        String userIn = key.nextLine();
        
        int passLength = userIn.length();
        
        if(passLength >= 8 && passLength <= 12) //Checks to see if the password length is long enough and does not exceed the limit
        {
            
            System.out.println();

            for(int i = 0; i < passLength; i++) //Loops through the password
            {
                
                if(Character.isUpperCase(userIn.charAt(i))) //Checks to see if there is an uppercase letter
                    upCounter++;
                if(Character.isDigit(userIn.charAt(i))) //Checks to see if there is a number in the password
                    digCounter++;
            }
            
            if(upCounter > 0 && digCounter > 0)
                System.out.println("You're good to go \n**********************");
            else if((upCounter > 0 && digCounter == 0))
                System.out.println("Invalid Password: You have no digit in your password \n************************");
            else if(upCounter == 0 && digCounter > 0)
                System.out.println("Invalid Password: You have no uppercase letter in your password \n*********************");
            else
                System.out.println();    
        } 
        else
            System.out.println("\nInvalid Password: Not enough characters or too much characters \n*******************");
    }
}