package lab6;

import java.util.Scanner;

public class Z34 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int a, b, j = 0;
        a = str.nextInt();
        b = str.nextInt();
        if (a < 0) {
            System.out.println("Значение W должно быть неотрицательно");
        } else if (b < 0)
            System.out.println("Значение H должно быть неотрицательно");
        else {
            System.out.print(" ");
            for (int i = 0; i < a; i++)
                System.out.print(i);

            while (j < b) {

                System.out.println();
                System.out.print(j);
                for (int i = 1; i <= a; i++) {
                    System.out.print(".");
                }
                j = j + 1;
                System.out.print("|");
            }
            System.out.println();
            System.out.print(" ");
            for (int i = 1; i <= a; i++) {
                System.out.print("-");
            }


        }
    }
}
