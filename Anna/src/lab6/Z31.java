package lab6;

import java.util.Scanner;

public class Z31 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int x, j=0;
        x = str.nextInt();
        if (x < 0 || x > 20) {
            System.out.println("Значение W должно быть в интервале [0, 20]");
        }
//        for (int i=1; i<=x; i++){
//            System.out.print(a);
//        }
//        System.out.println("\n");
//        for (int i=1; i<=x; i++){
//            System.out.print(b);
//        }
//        System.out.println("\n");
//        for (int i=1; i<=x; i++){
//            System.out.print(c);
//        }
//        System.out.println("\n");
//        for (int i=1; i<=x; i++){
//            System.out.print(d);
//        }
//        System.out.println("\n");
//        for (int i=1; i<=x; i++){
//            System.out.print(e);
//        }
//        System.out.println("\n");
//        for (int i=1; i<=x; i++){
//            System.out.print(f);
//        }
//        System.out.println("\n");
//        for (int i=1; i<=x; i++){
//            System.out.print(g);
//        }
//        System.out.println("\n");
//        for (int i=1; i<=x; i++){
//            System.out.print(h);
//        }
        while (x > j) {

            System.out.println();
            for (int i = 1; i <=x; i++) {
                System.out.print(j);
            }
            j=j+1;


        }
    }
}
