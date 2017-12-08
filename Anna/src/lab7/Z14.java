package lab7;

import java.util.Scanner;

public class Z14 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String a = str.nextLine();
        String g = "]";
        int t;
        t=a.length();
        for (int i = 0; i <=t; i++) {
            char w = a.charAt(i);
            int Y = a.indexOf(w);
            if (w == '"' && Y % 2 == 0) {
                System.out.println(a.replaceFirst("\"", "]"));

            } else if (w == '"' && Y % 2 != 0) {
                System.out.println(a.replaceFirst("\"", "["));


            }
        }
    }
}
