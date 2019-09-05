/******************************************************************************************************************

I often wondered what I needed to make on my last exam in order to get a passing average. I got too tired of
calculating it on paper, so here it is...

Julian Tiu
9/24/2015
******************************************************************************************************************/



import java.util.Scanner;
 
public class JulianTiuExerciseSeven
{
	public static void main(String[] args) 
	{
    
        Scanner key = new Scanner(System.in);
		
		int i;
		double AddemUp = 0;
		
		System.out.println();
		System.out.println("****************************************************");
		System.out.println();
		System.out.println("How many tests have you taken prior to the one coming up?");
        int nOT = key.nextInt();
        
        int tests[] = new int[nOT];
        
        
        for(i = 0; i < nOT; i++)
        {
            
            System.out.println("Enter the test grade for test " + (i+1) + " *round to the nearest whole number*");
            tests[i] = key.nextInt();

        }
        
        
		 for(i = 0; i < nOT; i++) 
        {
        
			AddemUp += tests[i];
          
        }
		
		
		double avg1 = (AddemUp)/(nOT);
		System.out.println("The average of those three test grades is: " + avg1);
		
		System.out.println();
		
		System.out.println("Realistically speaking, what grade do you think you'll get on the next test? Let me help you answer that... did you study? *Enter a whole number*");
		int nextTest = key.nextInt();
	
		double avg2 = (AddemUp + nextTest) / (nOT+1);

		if( avg2 > 70 || avg2 == 100)
		{
			System.out.println("Okay good, you'll pass then...");
		}
		if(avg2 < 70)
		{
			System.out.println("LOL sorry, realistically speaking, you'll fail.");
		}
		
		
		int x = (70)*(nOT + 1);
		double avg3 = x - AddemUp;
		System.out.println("You need to get at least a(n) " + avg3 + " on your next test to receive a 70 as your average.");
		System.out.println();
		System.out.println("****************************************************");
	

	}
}