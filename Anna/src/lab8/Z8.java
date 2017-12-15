package lab8;

import java.util.Scanner;

public class Z8 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String str = a.nextLine();
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println( reverse);
    }
}


