//Julian Tiu
//Oct 23, 2015

import java.util.Scanner;
public class JulianTiuExerciseTwentyFive{
  public static void main(String[]args)
  {
      Scanner keydot = new Scanner(System.in);
      String userInput;
      String[] sprite =
      {
       "     ",
       "     ",
       "  x  ",
       "     ",
       "     "
		};
        do{
            print(sprite);
            direction(sprite);
            System.out.println();
            System.out.println("Againt? (y/n)");
            userInput = keydot.next();
        }while(userInput.equalsIgnoreCase("y"));

   }
   	  
   public static void print(String[] printable)
   {		
     for(int k = 0; k < printable.length; k++)
     {
		System.out.println(printable[k]);
     }
   }
   public static void direction(String[] dir){
        Scanner key = new Scanner(System.in);
        System.out.println("Type w,a,s,d");
        String user = key.next();
        
        if(user.equalsIgnoreCase("w")){
            dir[1] = "  x  ";
            dir[2] = "  x  ";
            dir[3] = "     ";
        }    
        if(user.equalsIgnoreCase("s")){
            dir[3] = "  x  ";
            dir[2] = "  x  ";
            dir[1] = "     ";
        }
        if(user.equalsIgnoreCase("a")){
            dir[2] = " xx  ";
            dir[3] = "     ";
            dir[1] = "     ";
        }
        if(user.equalsIgnoreCase("d")){
            dir[2] = "  xx ";
            dir[3] = "     ";
            dir[1] = "     ";
        }
        print(dir);
    }
}
