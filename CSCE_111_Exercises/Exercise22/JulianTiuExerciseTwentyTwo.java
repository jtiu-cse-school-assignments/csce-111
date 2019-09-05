// Julian Tiu
// Oct. 15, 2015

import java.util.Scanner;

public class JulianTiuExerciseTwentyTwo{
	public static void main (String[] args){
		
		Scanner key = new Scanner(System.in);
		System.out.println("\nWe're going sort your inputs from largest length value to lowest length value");
		System.out.println("Fist, enter how many words you're going to sort: ");
		int userInput1 = key.nextInt();
		System.out.println();
		
		String alpha[] = new String[userInput1];
		
		System.out.println("Enter the words you want to organize by length: ");
		for(int z = 0; z < alpha.length; z++){
			
			System.out.println("Enter word" + (z+1) + ": ");
			alpha[z] = key.next();
			
		}
			
		String temp;
		for(int i = 0; i < alpha.length; i++){
			for(int j = 0; j < i; j++){
				if(alpha[i].length() > alpha[j].length()){
					temp = alpha[j];
					alpha[j] = alpha[i];
					alpha[i] = temp;
				}		
			}// end inside for loop
		}// end outside for loop
		
		for(int y = 0; y < alpha.length; y++){
			System.out.println("\n" + alpha[y]);
		}// end printing out the words in order
		
	}// end main
}// end class
