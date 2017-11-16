package lab6;

import java.util.Scanner;

public class Z35 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int a;
        String b;
        a = str.nextInt();
        b = str.next();
        if (a < 0)
            System.out.println("Значение H должно быть неотрицательно");
        else {
            for (int i = 1; i <= a; i++) {
                System.out.print(b);
            }
        }
    }
}