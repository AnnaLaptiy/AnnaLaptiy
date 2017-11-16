package lab6;

import java.util.Scanner;

public class Z32 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a;
        int b,c,t;
        a=str.nextLine();
        b=str.nextInt();
        c=str.nextInt();
        t=b*c;
        if (b<0)
            System.out.println("Значение W должно быть неотрицательно");
        else if (c<0)
            System.out.println("Значение H должно быть неотрицательно");
        for (int i=1;i<=t; i++){
            System.out.print(a);
            if (i%b==0)
                System.out.print("\n");

        }
    }
}
