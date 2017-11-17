package lab6;

import java.util.Scanner;

public class Z33 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a;
        a=str.nextInt();
        if (a<0){
            System.out.println("Значение W должно быть неотрицательно");
        }
        else {
            System.out.print("+");
            for (int i = 2; i < a; i++) {
                System.out.print("-");
            }
            System.out.print("+");
            System.out.println();
            System.out.print("|");
            for (int i = 2; i < a; i++) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();
            System.out.print("+");
            for (int i = 2; i < a; i++) {
                System.out.print("-");
            }
            System.out.println("+");

        }
    }
}
