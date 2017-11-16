package lab6;

import java.util.Scanner;

public class Z31 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int x;
        String a, b, c,d,e,f,g,h,r;
        a="1";
        b="2";
        c="3";
        d="4";
        e="5";
        f="6";
        g="7";
        h="8";
        r="9";

        x=str.nextInt();
        if (x<0||x>20) {
            System.out.println("Значение W должно быть в интервале [0, 20]");
        }
        for (int i=1; i<=x; i++){
            System.out.print(a);
        }
        System.out.println("\n");
        for (int i=1; i<=x; i++){
            System.out.print(b);
        }
        System.out.println("\n");
        for (int i=1; i<=x; i++){
            System.out.print(c);
        }
        System.out.println("\n");
        for (int i=1; i<=x; i++){
            System.out.print(d);
        }
        System.out.println("\n");
        for (int i=1; i<=x; i++){
            System.out.print(e);
        }
        System.out.println("\n");
        for (int i=1; i<=x; i++){
            System.out.print(f);
        }
        System.out.println("\n");
        for (int i=1; i<=x; i++){
            System.out.print(g);
        }
        System.out.println("\n");
        for (int i=1; i<=x; i++){
            System.out.print(h);
        }
    }
}
