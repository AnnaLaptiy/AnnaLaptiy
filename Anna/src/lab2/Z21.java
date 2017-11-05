package lab2;

import java.util.Scanner;

public class Z21 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        float a,b;
        a=str.nextFloat();
        b=str.nextFloat();
        if (a==0)
            System.out.println("Значение а не должно быть равно 0");
        else if (b==0)
            System.out.println("Значение ь не должно быть равно 0");
        else{
            System.out.printf("%.4f", 1/a+1/b);
        }
    }
}
