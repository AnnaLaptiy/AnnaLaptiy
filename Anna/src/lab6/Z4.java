package lab6;

import java.util.Scanner;

public class Z4 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a,b;
        a=str.nextInt();
        b=str.nextInt();
        if (a>b)
            System.out.println("Значение A должно быть не больше значения B");
        else{
            for (int i=b; i>=a; i--){
                System.out.println(i);
            }
        }
    }
}
