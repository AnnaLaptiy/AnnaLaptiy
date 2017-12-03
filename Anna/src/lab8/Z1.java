package lab8;

import java.util.Scanner;

public class Z1 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a;
        int b,e;
        b=str.nextInt();
        a=str.next();
        e=a.length();
if (b>e||b<e)
    System.out.println("Число A должно быть в интервале [0, размер массива)");
else {
            char ch=a.charAt(b);
            System.out.println(ch);}}




    }

