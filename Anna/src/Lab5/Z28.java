package Lab5;

import java.util.Scanner;

public class Z28 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a,b,c,d;
        a=str.nextInt();
        b=str.nextInt();
        c=str.nextInt();
        d=str.nextInt();
        if (a<=0)
            System.out.println("Значение A должно быть неотрицательным");
        else if (b<=0)
            System.out.println("Значение B должно быть неотрицательным");
        else if (c<=0)
            System.out.println("Значение C должно быть неотрицательным");
        else if (d<=0)
            System.out.println("Значение D должно быть неотрицательным");
        else{
            if (a<=c&&b<=d)
                System.out.println("Размещение возможно");
            else
                System.out.println("Размещение невозможно");
        }
    }
}
