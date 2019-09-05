//Julian Tiu
//Oct. 30, 2015

public class JulianTiuExerciseThirty{  
   /**
    Tests each functions
    
    */
   public static void main(String[] args){
      
      System.out.println();      
      winCondition("win prizes");
      winCondition("pin the tail");
      winCondition("wit frys?");
      winCondition("pit viper");
      System.out.println();
      maxInt(1, 2, 3);
      maxInt(3, 2, 3);
      maxInt(2, 5, 3);
      maxInt(7, 5, 4);
      System.out.println();
      isNaughty("naughty", "naughty");
      isNaughty("naughty", "any-string");
      isNaughty("any-string", "naughty");
      isNaughty("any-string", "any-string");
      System.out.println();
      isNice("nice", "any-string");
      isNice("any-string", "nice");
      isNice("nice", "any-string");
      isNice("any-string", "any-string");
      System.out.println();
      nearest10(8, 13);
      nearest10(13, 8);
      nearest10(13, 7);
      System.out.println();
      sameLastDigit(3, 3);
      sameLastDigit(7, 17);
      sameLastDigit(6, 17);
      sameLastDigit(3, 113);
      System.out.println();
      lovesYou("I love TAMU");
      lovesYou("I love Basketball");
      lovesYou("");
      lovesYou("any thing else");
      System.out.println();
      catch22("Catch 22");
      catch22("22 Rifle");
      catch22("Bottles of beer, 22 on the Wall");
      System.out.println();
      formalWords("hi");
      formalWords("This is our finest hour");
      System.out.println();
      deleteArticles("cat");
      deleteArticles("a cat");
      deleteArticles("The cat in a hat");
      System.out.println();
      
   }// end main
   
   
   /**
   Boolean function returns true if the given string begins with "win", 
   except the 'w' can be anything, so "win", "fin", "pin", "8in" .. all count. 
   
   winCondition("win prizes") → true
   winCondition("pin the tail") → true
   winCondition("wit frys?") → false
   winCondition("pit viper") → false
   
   */
   public static boolean winCondition(String original) 
   {
      boolean returnValue = false;
      
      if(original.length() == 0){
         
      }
      else if(original.substring(1,3).equalsIgnoreCase("in")){
      
         returnValue = true;
      }
      System.out.println(returnValue);
      return returnValue;
      
   }
   
   /**
   Int function, Given three input int values return the largest. 
   
   maxInt(1, 2, 3) → 3
   maxInt(3, 2, 3) → 3
   maxInt(2, 5, 3) → 5
   maxInt(7, 5, 4) → 7
   
   */
   public static int maxInt(int first, int second, int third) 
   {
      int returnValue = 0;
      int[] arr = {first, second, third};
      int maxInt = 0;
      
      for(int i = 0; i <  arr.length; i++){
         if(arr[i] > maxInt){

            maxInt = arr[i];
         }
         returnValue = maxInt;
      }
      
      System.out.println(returnValue);
      return returnValue;
   }
   
   
   
   
   /**
   Boolean function returns true only if both input strings are "naughty". 
   
   isNaughty("naughty", "naughty") → true
   isNaughty("naughty", "any-string") → false
   isNaughty("any-string", "naughty") → false
   isNaughty("any-string", "any-string") → false
   
   */
   public static boolean isNaughty(String firstString, String secondString) 
   {
      boolean returnValue = false;
      String[] arr = {firstString, secondString};
      for(int i = 0; i < arr.length-1; i++){
         if(arr[i].equalsIgnoreCase("naughty") && arr[i+1].equalsIgnoreCase("naughty")){
            returnValue = true;
         }
         else{
            
         }
      }
      
      System.out.println(returnValue);
      return returnValue;
   }
   
   /**
   Boolean function returns true if either input string is "nice". 
   
   isNice("nice", "any-string") → true
   isNice("any-string", "nice") → true
   isNice("nice", "any-string") → true
   isNice("any-string", "any-string") → false
   
   */
   public static boolean isNice(String firstString, String secondString) 
   {
      boolean returnValue = false;
      
      String[] arr = {firstString, secondString};
      for(int i = 0; i < arr.length-1; i++){
         if(arr[i].equalsIgnoreCase("nice") || arr[i+1].equalsIgnoreCase("nice")){
            returnValue = true;
         }
         else{
            
         }
      }
   
      System.out.println(returnValue);   
      return returnValue;
   }
   
   
   /**
   
   Int function takes 2 int values, returns whichever value is nearest 
   to 10, in the event of a tie return 0. 
   Note that Math.abs(n) returns the absolute value of a number. 
   
   nearest10(8, 13) → 8
   nearest10(13, 8) → 8
   nearest10(13, 7) → 0
   
   */
   
   public static int nearest10(int firstNumber, int secondNumber) 
   {
      int returnValue = 0;
      int[] arr = {firstNumber, secondNumber};
      for(int i = 0; i < arr.length-1; i++){
         if(Math.abs((arr[i]-10)) < Math.abs(arr[i+1]-10)){
            returnValue = arr[i];
         }
         else if(Math.abs((arr[i] - 10)) > Math.abs(arr[i+1] - 10)){
            returnValue = arr[i+1];
         }
         else{
            
         }
      }
      
      System.out.println(returnValue);
      return returnValue;
   }
   
   
   /**
   
   Boolean function takes two non-negative int values as input. 
   returns true if they have the same last digit, such as with 27 and 57. 
   Note that the % "mod" operator computes remainders, so 27 % 10 is 7. 
   
   
   sameLastDigit(3, 3) → true
   sameLastDigit(7, 17) → true
   sameLastDigit(6, 17) → false
   sameLastDigit(3, 113) → true
   
   */
   
   public static boolean sameLastDigit(int firstNumber, int secondNumber) 
   {
      boolean returnValue = false;
      
      int[] arr = {firstNumber, secondNumber};
      for(int i = 0; i < 1; i++){
         int div = arr[i] % 10;
         int div2 = arr[i+1] % 10;
         
         if(div == div2){
             returnValue = true;
         }
      }
      
      System.out.println(returnValue);
      return returnValue;
   }
   
   
   /**
   String function given a string, of the form 
   "I love any-thing" returns "any-thing loves you"
   if the input is not of the form "I love any-thing" the function 
   returns the string "Fred Rogers 143"
   
   lovesYou("I love TAMU") → "TAMU loves you"
   lovesYou("I love Basketball") → "Basketball loves you"
   lovesYou("") → "Fred Rogers 143"
   lovesYou("any thing else") → "Fred Rogers 143"
   
   */
   public static String lovesYou(String original) 
   {
      String returnValue = "";
      
      if(original.length() == 0){
         returnValue = "Fred Rogers 143";
      }
      else if(original.substring(0,6).equalsIgnoreCase("I LOVE")){
      
         returnValue = original.substring(7, original.length()) + " loves you";
      }
      else{
         returnValue = "Fred Rogers 143";
      }
      System.out.println(returnValue);
      return returnValue;
   }
   
   /**
   
   String function given a string, remove the characters 22 if they occur.
   If 22 occurs at the end or beginning of the input String remove any whitespace 
   that occurs at the beginning or end of the string.
   Remember String.strip() removes leading and trailing whitespace
   
   catch22("Catch 22") → "Catch"
   catch22("22 Rifle") → "Rifle"
   catch22("Bottles of beer, 22 on the Wall") → "Bottles of beer,  on the Wall"
   
   ** Note this function does not need to remove whitespace inside the string
   **Beer example output contains 2 spaces resulting when 22 was removed **
   */
   
   public static String catch22(String original) 
   {
      String returnValue = "";
      
      returnValue = original.replace("22", " ");
      returnValue = returnValue.trim();
   
      System.out.println(returnValue);
      return returnValue;
   }
   
   
   /**
   
   String function given a string, returns the string with the first character 
   of each input word capitalized. 
   
   formalWords("hi") → "Hi"
   formalWords("This is our finest hour") → "This Is Our Finest Hour"
   
   char .toUpperCase(char ch) can be used to change a char value to uppercase
   */
   
   public static String formalWords(String original) 
   {
      String returnValue = "";
      String firstLetter;
      
      String[] words = original.split("");
      for(int i = 0; i < words.length; i++){
         if(words[i].equals(" ")){
            
            words[i + 1] = words[i + 1].toUpperCase();
         }
         words[0] = words[0].toUpperCase();
         System.out.print(words[i]);
      }
      System.out.println();
      return returnValue;
   }
   
   
   /**
   String function given a string, returns the string with all English articles
   (the, an, a) removed.
   
   deleteArticles("cat") → "cat"
   deleteArticles("a cat") → "cat"
   deleteArticles("The cat in a hat") → "cat in hat"
   
   ** Note more strict whitespace removal required in this function **
   You can assume that replacing double-spaces with single-spaces is always OK.
   */
   
   public static String deleteArticles(String original) 
   {
      String returnValue = " ";
      
      String[] arr = original.split("");
      for(int i = 0; i < arr.length - 3; i++){
         if(arr[i].equalsIgnoreCase("T") && arr[i+1].equalsIgnoreCase("h") && arr[i+2].equalsIgnoreCase("e") && arr[i+3].equals(" ")){
            
            arr[i] = "";
            arr[i + 1] = "";
            arr[i + 2] = "";
            arr[i + 3] = "";
            
         }
      }
      for(int x = 0; x < arr.length - 2; x++){
         
         if(arr[x].equalsIgnoreCase("A") && arr[x+1].equalsIgnoreCase("n") && arr[x+2].equalsIgnoreCase(" ")){
            
            arr[x] = "";
            arr[x + 1] = "";
            arr[x + 2] = "";
         }
      }
      for(int y = 0; y < arr.length-1; y++){
         
         if(arr[y].equalsIgnoreCase("A") && arr[y+1].equalsIgnoreCase(" ")){
            
            arr[y] = "";
            arr[y+1] = "";
         }
      }
      for(int j = 0; j < arr.length; j++){
         
         System.out.print(arr[j]);
      }
      
      System.out.println();
      
      return returnValue;
      
      /*
      if(original.contains("the") || original.contains("The")){
         returnValue = original.replace(" The ", " ");
         returnValue = original.replace("The ", " ");
         returnValue = original.replace(" the ", " ");
         returnValue = original.replace("the ", " ");
      }
      
      if(original.contains("An") || original.contains("an")){
         returnValue = original.replace(" An ", " ");
         returnValue = original.replace("An ", " ");
         returnValue = original.replace(" an ", " ");
         returnValue = original.replace("an ", " ");
      }
      
      if(original.contains("a") || original.contains("A")){
         returnValue = original.replace(" A ", " ");
         returnValue = original.replace("A ", " ");
         returnValue = original.replace(" a ", " ");
         returnValue = original.replace("a ", " ");
      }
      */
   }
}