package lab2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Z2 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a;
        System.out.println("write a");
        a=str.nextInt();
        if(a<=0)
            System.out.println("Значение должно быть положительным");
        else{
            System.out.println(a*a*6);
        }

    }
}
