package lab6;

import java.util.Scanner;

public class Z22_2 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int i=0, j=0, n;
        n=str.nextInt();
        while (i<n){
            if(j==5){
                System.out.print(" ");
                j=0;
            }
            j++;
            i++;
            System.out.print("!");
        }
    }
}
