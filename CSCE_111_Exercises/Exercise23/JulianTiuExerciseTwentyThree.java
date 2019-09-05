/* Julian Tiu
 * 10-16-15
 */

import java.util.Scanner;
import java.util.Random;

public class JulianTiuExerciseTwentyThree{
    public static void main(String[] args){
        
        int guess;
        
        Scanner key = new Scanner(System.in);
        System.out.println("\nThis is a 2 player game. 1st player enters aword, and the 2nd player is going to guess how many letters are in that word");
        System.out.println("Player 1: ");
        String word = key.next();
        
        System.out.println("\nPlayer 2: *You only get 4 chances*");
        for(int i = 0; i < 4; i++){
        
            System.out.println("Input your guess: ");
            guess = key.nextInt();
            if(guess == word.length()){
                
                System.out.println("You guessed it!");
                System.out.println("The word is " + word + ", which has " + word.length() + " letters");
                break;
                
            }
            else if(guess > word.length())
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");
                
            if(i == 3)
            {
                System.out.println("\nGame Over");
                System.out.println("The word is " + word + ", which has " + word.length() + " letters");
            }

        }
    }
}