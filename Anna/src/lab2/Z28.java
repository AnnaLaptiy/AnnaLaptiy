package lab2;

import java.util.Scanner;

public class Z28 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        float a,b,c,x,f;
        a=str.nextFloat();
        b=str.nextFloat();
        c=str.nextFloat();
        x=str.nextFloat();
        f=a*x*x+b*x+c;

        if (x==0&&a==0&&b==0&&c==0)
            System.out.println("Знаменатель не может быть равен нулю");
        else if (f<0)
            System.out.println("Подкоренное выражение должно быть неотрицательным");
        else{
            System.out.printf("%.4f", 1/(Math.sqrt(f)));
        }
    }
}
