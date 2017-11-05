package lab2;

import java.util.Scanner;

public class Z23 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        float a,b,c,d;
        a=str.nextFloat();
        b=str.nextFloat();
        c=str.nextFloat();
        d=2;
        if (a==0||c==0)
            System.out.println("Уравнение не является квадратным");
        else{
            System.out.printf("%.4f", Math.pow(b,d)-4*a*c);
        }

    }
}
