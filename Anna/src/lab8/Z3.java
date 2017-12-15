package lab8;

import java.util.Scanner;

public class Z3 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        String str = x.nextLine();
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println( reverse);
    }
}


