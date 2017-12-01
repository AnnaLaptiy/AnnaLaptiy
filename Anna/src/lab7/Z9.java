package lab7;

import java.util.Scanner;

public class Z9 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        String a,r;
        a = str.next();
        char[] chars = a.toCharArray();
        for (char c : chars) {
            if (Character.isLowerCase(c)) {
                r=a.toLowerCase();

                System.out.println(r);
            }

            else {
                r=a.toUpperCase();

                System.out.println(r);
            }

        }
        System.out.println(" Верной является только первая строчка, на остальные не обращайте внимания :) ");
    }

}
