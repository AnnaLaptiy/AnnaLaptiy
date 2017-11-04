package lab2;

import java.util.Scanner;

public class Z16 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        float a,b;
        a=str.nextFloat();
        b=str.nextFloat();
        if (b<0)
            System.out.println("Значение должно быть не отрицательным");
        else if(a+b<0)
            System.out.println("Подкоренное значение должно быть не отрицательным");
        else{
            System.out.printf("%.4f", -5*Math.sqrt(a+(Math.sqrt(b))));
        }
    }
}
