package lab7;

import java.util.Scanner;

public class Z11 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a = str.next(), a1=a.trim();
int r;
r=a.length()-1;

int f1=r, s1=1;



        char buf1[]=new char[f1-s1];
        a1.getChars(s1,f1,buf1,0);
        System.out.print(buf1);



    }
}
