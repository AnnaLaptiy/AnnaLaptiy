package lab2;

import java.util.Scanner;

public class Z27 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        float a;
        a=str.nextFloat();
        System.out.printf("%.4f", Math.sqrt(1-((1-Math.cos(2*a))/2)));

    }
}
