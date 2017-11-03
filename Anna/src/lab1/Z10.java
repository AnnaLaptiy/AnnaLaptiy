package lab1;

import java.util.Scanner;

public class Z10 {
    public static void main(String[] args) {
        Scanner str=new Scanner (System.in);
        int x,y;
        System.out.println("x-");
        x=str.nextInt();
        System.out.println("y-");
        y=str.nextInt();
        System.out.println("INSERT INTO points (x, y) VALUES ('"+x+"', '"+y+"');");
    }
}
