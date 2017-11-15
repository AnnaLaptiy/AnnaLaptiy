package lab6;

import java.util.Scanner;

public class Z20 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a,b, s=0;
        a=str.nextInt();
        b=str.nextInt();
        if (a<b) {
            for (int i = a; i <= b; i++)
              s=s+i*i;
        }
        else if (a>b){
            for (int i =b; i<=a; i++)
                s=s+i*i;
        }
        System.out.println(s);
    }
}
