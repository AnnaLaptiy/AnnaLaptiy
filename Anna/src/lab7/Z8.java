package lab7;

import java.util.Scanner;

public class Z8 {
    public static void main(String[] args) {
        Scanner str= new Scanner(System.in);
        String  A="abcdefwxyz";
        int a,b, n,r;
        a=str.nextInt();
        b=str.nextInt();
        n=A.length();
        r=a+b;
        int s=0, f=a, f1=n;
        char buf[]=new char[f-s];
        A.getChars(s,f,buf,0);
        System.out.print(buf);

        char buf1[]=new char[f1-r];
        A.getChars(r,f1,buf1,0);
        System.out.print(buf1);


    }
}
