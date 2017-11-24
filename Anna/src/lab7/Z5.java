package lab7;

import java.util.Scanner;

public class Z5 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int a,b,f;
        String c;
        a=s.nextInt();
        b=s.nextInt();
        String str="abcdefwxyz";
        f=str.length();
        c=str.substring(a,b);
        if(a>b) {
            System.out.println("Значение CB должно быть в интервале [0,длина строки)");
        }
        else if (a<0) {
            System.out.println("Значение CA должно быть в интервале [0,длина строки)");
        }
        else if (b<0){
            System.out.println("Значение CB должно быть в интервале [0,длина строки)");
        }
        else if (b>f)
            System.out.println("Значение CB должно быть в интервале [0,длина строки)");

        else {
            System.out.println(c);
    }



        }

    }

