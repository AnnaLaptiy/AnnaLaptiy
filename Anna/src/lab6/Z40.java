package lab6;

import java.util.Scanner;

public class Z40 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a,b;
        int c,d,s=1,t;

        a=str.nextLine();
        b=str.next();
        c=str.nextInt();
        d=str.nextInt();
        t=c*d;

        while (s<=t){

            for (int i=1;i<=c;i++){
                System.out.print(a);
            }
            System.out.println();
            s=s+5;

            for (int i=1;i<=c;i++){
                System.out.print(b);

            }

            System.out.println();
            s=s+5;

        }
    }
}
