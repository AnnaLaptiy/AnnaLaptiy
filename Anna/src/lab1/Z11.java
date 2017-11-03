package lab1;

import java.util.Scanner;

public class Z11 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String cx, cy, r, fill;
        System.out.println("Напиши число ");
        cx=str.nextLine();
        System.out.println("Напиши число ");
        cy=str.nextLine();
        System.out.println("Напиши число ");
        r=str.nextLine();
        System.out.println("Напиши слово ");
        fill=str.nextLine();
        System.out.println("<circle cx=\" "+ cx+"\" cy=\""+ cy);
        System.out.println("\"r=\""+ r +"\" fill\"" + fill+ "\"/>");

    }
}
