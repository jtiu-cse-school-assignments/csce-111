// Julian Tiu
// Oct. 22, 2015

import java.util.ArrayList;

public class JulianTiuAnimation{
  public static void main(String[]args)
  {
      String[] sprite =
      {
       "                       .----.   ",
       "                      /'''''|   ",
       "                 .---/~~~~~~|   ",
       "______________/___/ /^^^^^^^\\ ",
       "=========)]  \\___| \\_______/ ",
       "\\\\_______________\\_/^^^^^^^^\\",
       "                 \\ \\________/",
       "                  \\~~~~~~~~\\ ",
       "                   \\________\\"
	  };
      
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
    gun.add(" ");
    gun.add(" ");

    for(int h = 0; h < 1; h++){
      for(int k = 6; k > 0; k--){
        for(int i = 0; i < animation.length; i++){
          if(i == 4){
                for(int j = 0; j < gun.size(); j++){
                  System.out.print(gun.get(j));
                }    
            System.out.print(animation[i]);
            System.out.println();
          }
          else{
      
            System.out.println("       " + animation[i]);
          }
        }
        gun.set(k, "-");
      }
    } 
  }
}
   