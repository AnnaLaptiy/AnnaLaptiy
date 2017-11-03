package Lab5;

import java.util.Scanner;

public class Z1 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a,b;
        a=str.nextInt();
        b=str.nextInt();
        if (a<b)
            System.out.println("второе ");
        else
            System.out.println("первое ");
    }
}
