package lab7;

import java.util.Scanner;

public class Z3 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a ="abcdefwxyz";
        String A,B;
        boolean boo, boo1;
        A=str.next();
        B=str.next();
        boo=a.contains(B);
        boo1=a.contains(A);
        int n, L, a1,b1;
        a1=a.indexOf(A);
        b1=a.indexOf(B);
        if (a1<b1) {
            n = a.indexOf(a);
            L = a.length();

            if (boo && boo1) {
                String k = a.substring(a1, b1 + 1);
                int t, V, V1;
                t = k.indexOf(k);
                V = L - b1;
                V1 = L - V;
                System.out.println(V1 - 1);
            }
            else
                System.out.println("Значение A отсутствует  в строке");
        }
        else if (a1>b1){
            n = a.indexOf(a);
            L = a.length();
            if (boo && boo1) {
                String k = a.substring(b1, a1 - 1);
                int t, V, V1;
                t = k.indexOf(k);
                V = L - b1;
                V1 = L - a1;
                System.out.println(V - V1-1);
            }
            else
                System.out.println("Значение B отсутствует в строке");
        }


    }
}
