package lab6;

import java.util.Scanner;

public class Z16 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        double a, s = 0;
        a = str.nextDouble();
        if (a <= 0)
            System.out.println("Значение N должно быть положительным");
        else {
            for (int i = 1; i <= a; i++) {
                s += 1.0 / i;
            }
            System.out.printf("%.4f", s);

        }
    }
}
