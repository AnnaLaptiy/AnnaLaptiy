package Lab5;

import java.util.Scanner;

public class Z26 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double x,y;
        x=str.nextDouble();
        y=str.nextDouble();
        if (y>=0.5&&y<=1.5||x>=2)
            System.out.println("Принадлежит");
        else{
            System.out.println("Не принадлежит");
        }
    }
}
