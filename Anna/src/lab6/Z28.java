package lab6;

import java.util.Scanner;

public class Z28 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a;
        a=str.nextInt();
        if (a<0)
            System.out.println("Значение X должно быть положительным");
        for (int i=1; i<=a; i++){
            if (a%i==0)
                System.out.print(i+ " ");

        }
    }
}
