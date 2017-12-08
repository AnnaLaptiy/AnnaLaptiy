package lab7;

import java.util.Scanner;

public class Z9 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String a, r;
        a = str.next();
        char f = a.charAt(0);
        if (f == 's') {
            r = a.toLowerCase();
            System.out.println(r);
        } else if (f == 'U') {
            r = a.toUpperCase();
            System.out.println(r);
        } else {
            System.out.println(a);
        }
    }
}