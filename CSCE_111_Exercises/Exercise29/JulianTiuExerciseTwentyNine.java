// Julian Tiu
// Oct. 27, 2015
// Password Validity Checker

import java.util.Scanner;
public class JulianTiuExerciseTwentyNine{
    public static void main(String[] args){ // Main
    
    Scanner key = new Scanner(System.in);
    System.out.println("\nPassword Criteria: \n* Must be between 8 to 12 characters long \n* Must contain at least two CAPITAL letters \n* Must contain at least 2 numbers");
    System.out.println("\nEnter your password to check if it is a valid password: ");
    String userInput = key.nextLine();
    
    checkLength(userInput);
    upperCase(userInput);
    digits(userInput);
    
    }// end Main
    
    public static void checkLength(String pass){ // Checks to see password length
        int passLength = pass.length();
        
        if(passLength > 7 && passLength < 13){
            System.out.println();
            System.out.println("Sufficient ammount of characters");
        }
        else if(passLength < 7){
            System.out.println();
            System.out.println("Insufficient ammount of characters");
        }
        else{
            System.out.println();
            System.out.println("Too much characters");
        }
        
    }// end checkLength
   
    public static void upperCase(String passw){ // checks to see for uppercase letters
        
        int upCaseCount = 0;
        
        for(int i = 0; i < passw.length();i++){
            if(Character.isUpperCase(passw.charAt(i))){
                upCaseCount++;
            }
        }
        if(upCaseCount > 1){
            System.out.println();
            System.out.println("Sufficient ammount of uppercase letters");
        }
        else{
            System.out.println();
            System.out.println("Insufficient amount of uppercase letters");
        }
    }// end upperCase
    
    public static void digits(String passwo){ // checks to see how many digits there are
        
        int digCount = 0;
        
        for(int j = 0; j < passwo.length();j++){
            if(Character.isDigit(passwo.charAt(j))){
                digCount++;
            }    
        }
        if(digCount > 1){
            System.out.println();
            System.out.println("Sufficient amount of digts");
            System.out.println("***********END************");
        }
        else{
            System.out.println();
            System.out.println("Insufficient amount of digits");
            System.out.println("*************END*************");
        }
    }// end digits
    
}//end public class JulianTiuExerciseTwentyNine