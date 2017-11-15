package lab6;

import java.util.Scanner;

public class Z23 {
    public static void main(String[] args) {
        Scanner str =new Scanner(System.in);
        int a;
        String b;
        b="#";
       a=str.nextInt();
       if (a<0)
           System.out.print("Значение N должно быть неотрицательным");
       else{
           for (int i=1; i<a; i++) {
               System.out.print(b);
               if (i%20==0)
                   System.out.print("\n");
               System.out.print(b);


           }
       }

    }
}
