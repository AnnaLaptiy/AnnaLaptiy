package lab2;

import java.util.Scanner;

public class Z33 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double a,r=6350;
        a=str.nextDouble();
        if (a<0)
            System.out.println("Высота над уровнем Земли должна быть неотрицательна");
        else{
            System.out.printf("%.4f", Math.sqrt(a*(2*r+a)));
        }

    }
}
