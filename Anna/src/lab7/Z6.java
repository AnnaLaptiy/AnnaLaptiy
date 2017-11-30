package lab7;

import java.util.Scanner;

public class Z6 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String a = "abcdefwxyz";
        String A, B;
        boolean boo, boo1;
        A = str.next();
        B = str.next();

        boo = a.contains(B);
        boo1 = a.contains(A);
        int L, a1, b1;
        a1 = a.indexOf(A);
        b1 = a.indexOf(B);
        if (boo && boo1) {
            if (a1 < b1) {
                L = a1 + 1;
                String k = a.substring(L, b1);
                System.out.println(k);
            }
            else if (a1 > b1) {
                L = b1 + 1;
                String k = a.substring(L, a1);
                System.out.println(k);
            }

        }
        else System.out.println("Значение C отсутствует в строке");
    }

}
