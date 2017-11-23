package Lab5;

import java.util.Scanner;

public class Z30 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a,b,c,d,f,g;
        a=str.nextInt();
        b=str.nextInt();
        c=str.nextInt();
        d=str.nextInt();
        f=str.nextInt();
        g=str.nextInt();
        if(a<0)
            System.out.println("Координата X должна быть неотрицательной");
        else{
            if(a>=c&&b>=d&&a<=f&&b<=g)
                System.out.println("Точка принадлежит прямой");
            else
                System.out.println("Точка не принадлежит прямой");
        }
    }
}
