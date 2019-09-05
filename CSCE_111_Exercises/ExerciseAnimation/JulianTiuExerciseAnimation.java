// Julian Tiu
// Oct. 22, 2015

import java.util.ArrayList;

public class JulianTiuExerciseAnimation{
  public static void main(String[]args)
  {
      String[] sprite =
      {
       "                                   .----.   ",
       "                                  /'''''|   ",
       "                             .---/~~~~~~|   ",
       "              ______________/___/ /^^^^^^^\\ ",
       "=========)]  \\___| \\_______/ ",
       "               \\\\_______________\\_/^^^^^^^^\\",
       "                                \\ \\________/",
       "                                 \\~~~~~~~~\\ ",
       "                                  \\________\\"
	  };
      
      animate2(sprite);
      animate(sprite);
  }


  public static void animate(String[] animation){
    
    //String[] gun = {" ", " ", " ", " ", " "};
    ArrayList<String> gun = new ArrayList<String>();
    gun.add(" ");
    gun.add(" ");
    gun.add(" ");
    gun.add(" ");
    gun.add(" ");
    
    for(int h = 0; h < 2; h++){
      for(int i = 0; i < animation.length; i++){
        if(i == 4){
            for(int k = 4; k > 0; k--){ 
              for(int j = 0; j < gun.size(); j++){
                System.out.print(gun.get(j));
              }  
              gun.set(k, "-");
            }    
          System.out.print(animation[i]);
          System.out.println();
        }
        else{
    
          System.out.println("     " + animation[i]);
        }
      }
    }
  }
  public static void animate2(String[] animation2){
    for(int x = 0; x < animation2.length; x++){
      if(x == 4){
        System.out.println("                   " + animation2[x]);
      }
      else{
        System.out.println("    "+ animation2[x]);
      }
    }
  }
}
   