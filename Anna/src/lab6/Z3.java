package lab6;

import java.util.Scanner;

public class Z3 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a,b;
        a=str.nextInt();
        b=str.nextInt();
        if (a>b)
            System.out.println("Значение A должно быть не больше значения B");
        else{
            for (int i=a; i<=b; i++){
                System.out.println(i);
            }
        }
    }
}
