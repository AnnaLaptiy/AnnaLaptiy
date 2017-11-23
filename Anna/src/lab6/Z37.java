package lab6;

import java.util.Scanner;

public class Z37 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int a, b, f = 0, c, s = 2;
        a = str.nextInt();
        b = str.nextInt();
        if (a < 0)
            System.out.println("Значение W должно быть неотрицательно");
        else if (b < 0)
            System.out.println("Значение H должно быть неотрицательно");
        else if (a == 0 || b == 0)
            System.out.println();
        else {
            for (int i = 1; i <= a; i++) {
                System.out.print("+");
            }
            c = a - 1;
            System.out.println();
            for (int i = 1; i <= c; i++) {
                System.out.print("+");
            }
//        f = f + 1;
//        for (int i=c; i<a; i++) {
//            f = f + 1;
//            System.out.print("#");
//        }
//        c=c-1;
//        System.out.println();
//        for (int i=1; i<=c; i++) {
//            System.out.print("+");
//        }
//        f = f + 1;
//        for (int i=c; i<a; i++) {
//            f = f + 1;
//            System.out.print("#");
//        }
//        c=c-1;
//        System.out.println();
//        for (int i=1; i<=c; i++) {
//            System.out.print("+");
//        }
//        f = f + 1;
//        for (int i=c; i<a; i++) {
//            f = f + 1;
//            System.out.print("#");
//        }
//        c=c-1;
//        System.out.println();
//        for (int i=1; i<=c; i++) {
//            System.out.print("+");
//        }
//        f = f + 1;
//        for (int i=c; i<a; i++) {
//            f = f + 1;
//            System.out.print("#");
//        }

            while (s <= b) {
                f = f + 1;
                for (int i = c; i < a; i++) {
                    f = f + 1;
                    System.out.print("#");
                }
                c = c - 1;
                System.out.println();
                for (int i = 1; i <= c; i++) {
                    System.out.print("+");
                }
                s = s + 1;


            }

        }
    }
}
