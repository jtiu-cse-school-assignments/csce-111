/*

  Julian Tiu
  Oct. 14, 2015

*/






import java.util.Scanner;

public class JulianTiuExerciseCreateStory
{
  public static void main( String[] args )
  {
      Scanner key = new Scanner(System.in);
      
      System.out.println("\nToday, you're going to find out what your rapper name is!");
      System.out.println("Enter the number that corresponds to the first letter of your first name: (a = 1, b = 2, c = 3, d = 4...)");
      int name1 = key.nextInt();
      System.out.println("Enter the number that corresponds to the first letter of your last name: (a = 1, b = 2, c = 3, d = 4...)");
      int name2 = key.nextInt();
      
      String rapName1, rapName2;
      
      switch(name1)
      {
          case 1: rapName1 = "Lil";
            break;
          case 2: rapName1 = "Big";
            break;
          case 3: rapName1 = "Killa";
            break;
          case 4: rapName1 = "DJ";
            break;
          case 5: rapName1 = "Capital";
            break;
          case 6: rapName1 = "Grill";
            break;
          case 7: rapName1 = "Chrome";
            break;
          case 8: rapName1 = "West";
            break;
          case 9: rapName1 = "Snuggle";
            break;
          case 10: rapName1 = "Money";
            break;
          case 11: rapName1 = "Thug";
            break;
          case 12: rapName1 = "Slick";
            break;
          case 13: rapName1 = "Juice";
            break;
          case 14: rapName1 = "Boom";
            break;
          case 15: rapName1 = "Dippin";
            break;
          case 16: rapName1 = "Pops";
            break;
          case 17: rapName1 = "Q";
            break;
          case 18: rapName1 = "Street";
            break;
          case 19: rapName1 = "Ragz";
            break;
          case 20: rapName1 = "Balla";
            break;
          case 21: rapName1 = "Fella";
            break;
          case 22: rapName1 = "Ice";
            break;
          case 23: rapName1 = "Bundle";
            break;
          case 24: rapName1 = "Dip";
            break;
          case 25: rapName1 = "Jay";
            break;
          case 26: rapName1 = "Izzle";
            break;
          default: rapName1 = "Dee";
            
      }
      switch(name2)
      {
        
          case 1: rapName2 = "Cube";
            break;
          case 2: rapName2 = "Sniff";
            break;
          case 3: rapName2 = "Tank";
            break;
          case 4: rapName2 = "Shrimp";
            break;
          case 5: rapName2 = "Cripp";
            break;
          case 6: rapName2 = "Boss";
            break;
          case 7: rapName2 = "Shot";
            break;
          case 8: rapName2 = "Beat";
            break;
          case 9: rapName2 = "Mic";
            break;
          case 10: rapName2 = "Dizzy";
            break;
          case 11: rapName2 = "Elvis";
            break;
          case 12: rapName2 = "Mac";
            break;
          case 13: rapName2 = "Fresh";
            break;
          case 14: rapName2 = "Fly";
            break;
          case 15: rapName2 = "C";
            break;
          case 16: rapName2 = "Crib";
            break;
          case 17: rapName2 = "Pizzle";
            break;
          case 18: rapName2 = "Shnizzle";
            break;
          case 19: rapName2 = "Slice";
            break;
          case 20: rapName2 = "F";
            break;
          case 21: rapName2 = "Funk";
            break;
          case 22: rapName2 = "G";
            break;
          case 23: rapName2 = "Daddy";
            break;
          case 24: rapName2 = "Riff";
            break;
          case 25: rapName2 = "Dawg";
            break;
          case 26: rapName2 = "Dood";
            break;
          default: rapName2 = "Dee";
            
      }
      
      System.out.println("Your rapper name is: " + rapName1 + " " + rapName2);
      
  }
}