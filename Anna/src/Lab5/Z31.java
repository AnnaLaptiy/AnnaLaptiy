package Lab5;

import java.util.Scanner;

public class Z31 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a,b,c,d;
        a=str.nextInt();
        b=str.nextInt();
        c=str.nextInt();
        d=str.nextInt();
        if (a>b||c>d)
            System.out.println("Значение A должно быть меньше значения B");
        else {

            if (c < b && d > c && a < b && b < d && a < c)
                System.out.println("пересекаются (" + c + "; " + b + ")");
            else if (b > d && a < c && d > c && b > d)
                System.out.println("пересекаются (" + c + "; " + d + ")");
            else if (a < b && b > c && c < d && d < b)
                System.out.println("пересекаются (" + a + "; " + d + ")");
            else if (c < a && a < b && d > b && c < d)
                System.out.println("пересекаются (" + a + "; " + b + ")");
            else if (a > b && d > b && c < b)
                System.out.println("не пересекаются");
            else
                System.out.println("не пересекаются");
        }
    }
}
