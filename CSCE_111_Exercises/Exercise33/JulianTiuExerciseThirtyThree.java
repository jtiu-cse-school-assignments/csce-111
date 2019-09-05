//Julian Tiu
//Nov. 8, 2015

import java.util.Scanner;

public class JulianTiuExerciseThirtyThree{
    
    public static void main(String[] args){
     
        System.out.println();
        String line1 = "Kilo Hecto Deka";
        String line2 = "Deci Centi Mili";
        System.out.println("The metric units available are: \n" + line1 + "\n" + line2 + "\nOr No Prefix (Basic Units)" + "\n");
        
        Scanner key = new Scanner(System.in);
    
        conversion(key);
    }// end main
    
    public static double conversion(Scanner kReader){
        
        double ans = 0.0;
        
        System.out.println("What prefix do you want to change from (If no prefix, enter 'basic units'): ");
        String userInput = kReader.nextLine();
        System.out.println("What prefix do you want to change to (If no prefix, enter 'basic units'): ");
        String userInput2 = kReader.nextLine();
        System.out.println("Enter number: ");
        double userInput3 = kReader.nextDouble();
        
        if(userInput.equalsIgnoreCase("kilo")){
            
            if(userInput2.equalsIgnoreCase("hecto")){
                ans = userInput3*10;
            }
            if(userInput2.equalsIgnoreCase("deka")){
                ans = userInput3*100;
            }
            if(userInput2.equalsIgnoreCase("basic units")){
                ans = userInput3*1000;
            }
            if(userInput2.equalsIgnoreCase("deci")){
                ans = userInput3*10000;
            }
            if(userInput2.equalsIgnoreCase("centi")){
                ans = userInput3*100000;
            }
            if(userInput2.equalsIgnoreCase("mili")){
                ans = userInput3*1000000;
            }
        }
        else if(userInput.equalsIgnoreCase("hecto")){
            
            if(userInput2.equalsIgnoreCase("kilo")){
                ans = userInput3/10;
            }
            if(userInput2.equalsIgnoreCase("deka")){
                ans = userInput3*10;
            }
            if(userInput2.equalsIgnoreCase("basic units")){
                ans = userInput3*100;
            }
            if(userInput2.equalsIgnoreCase("deci")){
                ans = userInput3*1000;
            }
            if(userInput2.equalsIgnoreCase("centi")){
                ans = userInput3*10000;
            }
            if(userInput2.equalsIgnoreCase("mili")){
                ans = userInput3*100000;
            }
        }
        else if(userInput.equalsIgnoreCase("deka")){
            if(userInput2.equalsIgnoreCase("kilo")){
                ans = userInput3/100;
            }
            if(userInput2.equalsIgnoreCase("hecto")){
                ans = userInput3/10;
            }
            if(userInput2.equalsIgnoreCase("basic units")){
                ans = userInput3*10;
            }
            if(userInput2.equalsIgnoreCase("deci")){
                ans = userInput3*100;
            }
            if(userInput2.equalsIgnoreCase("centi")){
                ans = userInput3*1000;
            }
            if(userInput2.equalsIgnoreCase("mili")){
                ans = userInput3*10000;
            } 
        }
        else if(userInput.equalsIgnoreCase("deci")){
        
            if(userInput2.equalsIgnoreCase("kilo")){
                ans = userInput3/10000;
            }
            if(userInput2.equalsIgnoreCase("hecto")){
                ans = userInput3/1000;
            }
            if(userInput2.equalsIgnoreCase("deka")){
                ans = userInput3/100;
            }
            if(userInput2.equalsIgnoreCase("basic units")){
                ans = userInput3/10;
            }
            if(userInput2.equalsIgnoreCase("centi")){
                ans = userInput3*10;
            }
            if(userInput2.equalsIgnoreCase("mili")){
                ans = userInput3*100;
            } 
        }
        else if(userInput.equalsIgnoreCase("centi")){

            if(userInput2.equalsIgnoreCase("kilo")){
                ans = userInput3/100000;
            }
            if(userInput2.equalsIgnoreCase("hecto")){
                ans = userInput3/10000;
            }
            if(userInput2.equalsIgnoreCase("deka")){
                ans = userInput3/1000;
            }
            if(userInput2.equalsIgnoreCase("basic units")){
                ans = userInput3/100;
            }
            if(userInput2.equalsIgnoreCase("deci")){
                ans = userInput3/10;
            }
            if(userInput2.equalsIgnoreCase("mili")){
                ans = userInput3*10;
            }
        }
        else if(userInput.equalsIgnoreCase("mili")){

            if(userInput2.equalsIgnoreCase("kilo")){
                ans = userInput3/1000000;
            }
            if(userInput2.equalsIgnoreCase("hecto")){
                ans = userInput3/100000;
            }
            if(userInput2.equalsIgnoreCase("deka")){
                ans = userInput3/10000;
            }
            if(userInput2.equalsIgnoreCase("basic units")){
                ans = userInput3/1000;
            }
            if(userInput2.equalsIgnoreCase("deci")){
                ans = userInput3/100;
            }
            if(userInput2.equalsIgnoreCase("centi")){
                ans = userInput3/10;
            }           
        }
        else if(userInput.equalsIgnoreCase("basic units")){

            if(userInput2.equalsIgnoreCase("kilo")){
                ans = userInput3/1000;
            }
            if(userInput2.equalsIgnoreCase("hecto")){
                ans = userInput3/100;
            }
            if(userInput2.equalsIgnoreCase("deka")){
                ans = userInput3/10;
            }
            if(userInput2.equalsIgnoreCase("deci")){
                ans = userInput3*10;
            }
            if(userInput2.equalsIgnoreCase("centi")){
                ans = userInput3*100;
            }
            if(userInput2.equalsIgnoreCase("mili")){
                ans = userInput3*1000;
            }
        }
        else
        {
            System.out.println("Error: Wrong or no prefix entered");
        }
        
        System.out.println(ans);
        System.out.println();
        return ans;
    }// end conversion
}