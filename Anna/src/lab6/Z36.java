package lab6;

import java.util.Scanner;

public class Z36 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a,b;
        a=str.nextInt();
        b=str.nextInt();
        if (a<b) {
            for (int i =a;i<=b; i++){
                if (i%2!=0)
                    System.out.println("."+i);

                }


            }
        }
    }

