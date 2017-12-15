package lab8;

import java.util.Scanner;

public class Z4 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a=str.nextInt(),b=str.nextInt();
        String w=str.next();
        String R=w.replace(" ","");

        if(a<0||a>10)
            System.out.println("Число B должно быть в интервале [0, размер массива)");
        else if (b>10)
            System.out.println("Число E должно быть в интервале [0, размер массива)");
        else if (a<b){
            String k=R.substring(a,b+1);
            System.out.println(k);
        }
        else if (a>b){
            String k=R.substring(b,a+1);
            System.out.println(k);

    }

}}
