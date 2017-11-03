package Lab5;

import java.util.Scanner;

public class Z2 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a,b,c;
        a=str.nextInt();
        b=str.nextInt();
        if (a>b)
            System.out.println("максимальное "+ a+", Минимальное "+ b);
        else if (a<b)
            System.out.println("Максимальное "+ b+", Минимальное "+ a);
    }
}
