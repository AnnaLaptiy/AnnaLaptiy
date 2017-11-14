package lab6;

import java.util.Scanner;

public class Z11 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int a, s=0;
        a = str.nextInt();
        if (a < -100 || a > 500) {
            System.out.println("Значение A должно быть в интервале [-100, 500]");
        } else {
            for (int i = a; i <= 500; i++) {
                s = s + i;
            }
                System.out.println(s);

            }



        }
    }

