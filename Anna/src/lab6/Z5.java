package lab6;

import java.util.Scanner;

public class Z5 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String b;
        int a;
        b = str.nextLine();
        a = str.nextInt();
        if (a < 0) {
            System.out.println("Значение A должно быть неотрицательным");
        } else {
            System.out.print("\"");
            for (int i = 0; i <= a; i++) {
                System.out.print(b);
            }
            System.out.print("\"");

        }
    }
}
