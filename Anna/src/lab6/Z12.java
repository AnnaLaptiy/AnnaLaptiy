package lab6;

import java.util.Scanner;

public class Z12 {
    public static void main(String[] args) {
            Scanner str = new Scanner(System.in);
            int a, s=0;
            a = str.nextInt();
            if (a < -10 || a > 10000) {
                System.out.println("Значение b должно быть в интервале [-10,10000]");
            } else {
                for (int i = -10; i <= a; i++) {
                    s = s + i;
                }
                System.out.println(s);

            }



        }
    }

