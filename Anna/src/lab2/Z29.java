package lab2;

import java.util.Scanner;

public class Z29 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double a,b,c;
        a=str.nextDouble();
        b=a+5;
        c=a-5;
        if (b<0||c<0||a<0)
            System.out.println("Подкоренное выражение должно быть неотрицательным");
        else if (a>100)
            System.out.printf("%.4f", ((Math.sqrt(b)+Math.sqrt(c)))/(2*Math.sqrt(a)));
        else{
            System.out.printf("%.6f", ((Math.sqrt(b)+Math.sqrt(c)))/(2*Math.sqrt(a)));
        }

    }
}
