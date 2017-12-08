package lab7;

import java.util.Scanner;

public class Z12 {
    public static void main(String[] args) {
        Scanner str =  new  Scanner(System.in);
        String x=str.nextLine();
        int t,r=0;
        for (int i=0; i<x.length();i++){
            char f=x.charAt(i);
            if(f==','){
                r=r+1;

            }

        }
        System.out.println(r+1);
    }
}
