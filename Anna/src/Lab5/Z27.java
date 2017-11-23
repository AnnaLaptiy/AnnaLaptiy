package Lab5;

import java.util.Scanner;

public class Z27 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int i;
        i = str.nextInt();
        if (i < -10 || i > 100)
            System.out.println("Значение A должно быть в интервале [-10, 100]");
        else {

            if (i == 1 || i == -10 || i == 100) {
                System.out.println(i + "'ый");
            } else if (i % 2 == 0) {
                System.out.println(i + "'ой");
            } else if (i == 3)
                System.out.println(i + "'ий");
        }
    }
    }

