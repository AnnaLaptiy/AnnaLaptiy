package lab7;

import java.util.Scanner;

public class Z10 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String a = "abcdacadbacdaabaadc", c = " ",b;
        b = str.next();
        char ch = b.charAt(0);
        char hh= b.charAt(1);
        int L, b1;
        L = a.length();
        b1 = a.indexOf(b);
        if (b1 > 3 )
            System.out.println("Вводимая строка должна содержать ровно 2 символа");
        else {
            String J = (a.replace( hh,  ' ') );
            System.out.println(J.replace (ch, ' '));




        }
    }
}
