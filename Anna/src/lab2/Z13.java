package lab2;

import java.util.Scanner;

public class Z13 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double a;
        a=str.nextDouble();
        if (61-a<0)
            System.out.println("Выражение под корнем должно быть не отрицательным");
        else if (a==61||a==60)
            System.out.printf("%.0f", 3*Math.sqrt(61-a));
        else{
            System.out.printf("%.4f", 3*Math.sqrt(61-a));
        }
    }
}
