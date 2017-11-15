package lab6;

import java.util.Scanner;

public class Z25 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int a ;
        String b;
        b = "#";
        a = str.nextInt();
        if (a < 0 || a > 15)
            System.out.print("Значение Y должно быть в интервале [0, 15]");
        else {
            for (int i = 1; i <= a; i++) {
                System.out.print(b);

            }
            for (int i=a; i<15; i++){
                System.out.print(".");
            }
        }

    }
}
