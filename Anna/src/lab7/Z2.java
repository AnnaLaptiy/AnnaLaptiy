package lab7;

import java.util.Scanner;

public class Z2 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        String a;
        int n,l;
        String str="abcdefwxyz";
        a=s.next();
        n=str.indexOf(a);
        l=str.length();
        if(n>-1){
            System.out.println((l-n)-1);
        }
        else
            System.out.println("Значение отсутствует в строке");




    }
}
