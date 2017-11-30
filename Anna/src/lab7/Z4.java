package lab7;

import java.util.Scanner;

public class Z4 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int i, s=0;
        boolean I,P;
        String a, A="abcdacadbacdaabaadc";
        a=str.next();
        i=A.indexOf(a);
        I=A.contains(a);
        if (I){
          for(int e=0; e<=18; e++){
              if (e==i)
                System.out.println(i);
            }
        }




    }
}
