public class FizzBuzz{
    public static void main(String[] args){
    
    for(int i = 0; i < 101; i++){
        
        String PrintMe = " ";
        if( i % 3 == 0)
            PrintMe = PrintMe + "Fizz";
        if(i % 5 == 0)
            PrintMe = PrintMe + "Buzz";
        if(PrintMe == " ")
            System.out.println(i);
        else
            System.out.println(PrintMe);
    }
  }  
}