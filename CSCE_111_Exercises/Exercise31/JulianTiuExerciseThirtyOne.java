import java.util.Scanner;
import java.io.PrintStream;
import java.io.IOException;

public class JulianTiuExerciseThirtyOne{
    
    private static boolean firstWrite = true;
    
    public static void main(String[] args) throws IOException{
    
        String firstName;
        String lastName;
        String gender;
        String bloodType;
        int age;
        int weight;
        Scanner key = new Scanner(System.in);
        System.out.println();
        
        do{
            lastName = getName("last", key);
            firstName = getName("first", key);
            gender = getGAB("gender", key);
            bloodType = getGAB("blood type", key);
            age = getGAB2("age", key);
            weight = getGAB2("weight", key);
            PrintStream fileStream = new PrintStream(firstName + lastName + ".txt");
            write(firstName, lastName, gender, bloodType, age, weight, fileStream);
        }while(moreDonors(key));
        
        //key.close();
        //fileStream.close();
        
    }// end main
    
    public static String getName(String Name, Scanner kbReader){
        
        String readName = null;
        
        while(readName == null){
            System.out.println("Please enter your " + Name + " name, then 'enter': ");
            readName = kbReader.nextLine();
        }
        
        return readName;
    
    }// end getName
    
    public static String getGAB(String whatToGet, Scanner kbReader){
        
        String readGAB = null;
        
        while(readGAB == null){
            System.out.println("Please enter your " + whatToGet + ", then press 'enter': ");
            readGAB = kbReader.nextLine();
        }
        
        return readGAB;
    
    }// end getGAB
  
    public static int getGAB2(String whatToGet, Scanner kbReader){
        int readGAB2 = 0;
        
        while(readGAB2 == 0){
            System.out.println("Please enter your " + whatToGet + ", then press 'enter': ");
            readGAB2 = kbReader.nextInt();
        }
        
        return readGAB2;
    
    }// end getGAB2
    
    public static void write(String nameOne, String nameTwo, String gend, String bt, int ag, int wei, PrintStream fileStream){
        /*
        if(firstWrite){
            
            fileStream.print("Last Name,");
            fileStream.print("First Name,");
            fileStream.print("Gender,");
            fileStream.print("Blood Type,");
            fileStream.print("Age,");
            fileStream.print("Weight,");
            firstWrite = false;
        }
        */
        fileStream.println("Last name: " + nameOne);
        fileStream.println("First name: " + nameTwo);
        fileStream.println("Gender: " + gend);
        fileStream.println("Blood type: " + bt);
        fileStream.println("Age: " + ag);
        fileStream.println("Weight: " + wei);
        
    }// end write
    
    public static boolean moreDonors(Scanner kbReader){
        
        System.out.println("More donors? (Enter y or yes)");
        String More = kbReader.nextLine();
        kbReader.nextLine();
        if((More.equalsIgnoreCase("y")) || (More.equalsIgnoreCase("yes")))
        {
           return true;
        }
        else
        {
           return false;
        }
        
    }// end moreDonors 
}