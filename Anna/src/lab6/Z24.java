package lab6;

import java.util.Scanner;

public class Z24 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a;
        a=str.nextInt();
        for (int i=30; i<=40; i++){
            if (i==a)
                System.out.println(i +"+");
            else
            System.out.println(i +"-");
        }

    }
}
