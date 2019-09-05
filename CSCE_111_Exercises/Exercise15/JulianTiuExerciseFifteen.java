/*
 *Julian Tiu
 *10/02/15
 */

import java.util.Scanner;

public class JulianTiuExerciseFifteen
{
	public static void main( String[] args )
	{
		Scanner key = new Scanner(System.in);

		int age;

		System.out.print( "How young are you? " );
		age = key.nextInt();

		if ( age < 13)
			System.out.println( "You are too young to watch a PG-13 movie." );
		if ( age < 16 && age >= 13)
			System.out.println( "You are too young to get a part-time job, but at least you can watch PG-13 movies." );
		if ( age < 17 && age >= 16)
			System.out.println( "You are too young to play GTA, but at least you can have a job." );
		if ( age < 18 && age >= 17)
			System.out.println( "You are too young to vote, but at least you can now play GTA." );
		if ( age < 21 && age >= 18)
			System.out.println( "You are always too young to watch Game of Thrones, but at least you can vote." );
	}
}