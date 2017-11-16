package lab6;

import java.util.Scanner;

public class Z29 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int a, r;
        String t;
        a = str.nextInt();
        if (a < 0)
            System.out.println("Значение Y должно быть положительным");
        else {
            for(int i=2; i<3; i++) {
                r = a % i;
                if (r == 0)
                    t="число не простое";
                else
                    t="число простое";
                System.out.println(t);
            }
        }
    }
}
