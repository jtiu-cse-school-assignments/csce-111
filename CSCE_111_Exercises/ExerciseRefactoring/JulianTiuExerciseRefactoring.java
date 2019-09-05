// Julian Tiu
// Oct. 23, 2015
// Edited my exercise 22 code to include the formula method

import java.util.Scanner;

public class JulianTiuExerciseRefactoring{	
	public static void main (String[] args){
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("\nWe're going sort your inputs from largest length value to lowest length value");
		System.out.println("First, enter how many words you're going to sort: ");
		int userInput1 = key.nextInt();
		System.out.println();
		
		String alpha[] = new String[userInput1];
		
		formula(alpha);
		
	}// end main
	
	public static void formula(String[] abcde){
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the words you want to organize by length: ");
		for(int z = 0; z < abcde.length; z++){
			
			System.out.println("Enter word" + (z+1) + ": ");
			abcde[z] = key.next();
		}
		
		System.out.println();
			
		String temp;
		for(int i = 0; i < abcde.length; i++){
			for(int j = 0; j < i; j++){
				if(abcde[i].length() > abcde[j].length()){
					temp = abcde[j];
					abcde[j] = abcde[i];
					abcde[i] = temp;
				}		
			}// end inside for loop
		}// end outside for loop		
		for(int y = 0; y < abcde.length; y++){
			System.out.println(abcde[y]);
		}// end printing out the words in order
	}// end formula
}// end class
