package Lab5;

import java.util.Scanner;

public class Z17 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        float m,p,s;
        m=str.nextFloat();
        p=str.nextFloat();
        s=m%p;
        if(p==0)
            System.out.println("Значение P должно быть не равно нулю");
        else if (s==0)
            System.out.printf("%.0f",m/p);
        else
            System.out.println("M не делится нацело на P");
    }
}
