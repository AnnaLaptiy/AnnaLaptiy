package Lab5;

import java.util.Scanner;

public class Z10 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double X, Y, Z;
        X=str.nextDouble();
        Y=str.nextDouble();
        Z=str.nextDouble();
        if (X>0&&Y>0&&Z>0) {
            System.out.printf("%.4f", Math.pow(X, 2));
            System.out.print("; ");
            System.out.printf("%.4f", Math.pow(Y, 2));
            System.out.print("; ");
            System.out.printf("%.4f", Math.pow(Z, 2));
        }
        else if (X>0&&Y<0&&Z<0){
            System.out.printf("%.4f", Math.pow(X, 2));
            System.out.print("; ");
            System.out.printf("%.4f",Y);
            System.out.print("; ");
            System.out.printf("%.4f",Z);
        }

        else if (X>0&&Y>0&&Z<0){
            System.out.printf("%.4f", Math.pow(X, 2));
            System.out.print("; ");
            System.out.printf("%.4f", Math.pow(Y, 2));
            System.out.print("; ");
            System.out.printf("%.4f",Z);
        }
        else if (X>0&&Y<0&&Z>0) {
            System.out.printf("%.4f", Math.pow(X, 2));
            System.out.print("; ");
            System.out.printf("%.4f",Y);
            System.out.print("; ");
            System.out.printf("%.4f", Math.pow(Z, 2));
        }
        else if(X<0&&Y>0&&Z>0){
            System.out.printf("%.4f",X);
            System.out.print("; ");
            System.out.printf("%.4f", Math.pow(Y, 2));
            System.out.print("; ");
            System.out.printf("%.4f", Math.pow(Z, 2));
        }
        else if (X<0&&Y<0&&Z>0){
            System.out.printf("%.4f",X);
            System.out.print("; ");
            System.out.printf("%.4f", Y);
            System.out.print("; ");
            System.out.printf("%.4f", Math.pow(Z, 2));
        }

        else if (X<0&&Y<0&&Z<0) {
            System.out.printf("%.4f",X);
            System.out.print("; ");
            System.out.printf("%.4f",Y);
            System.out.print("; ");
            System.out.printf("%.4f",Z);
        }



    }
}
