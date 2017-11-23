package Lab5;

import java.util.Scanner;

public class Z25 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double x,y;
        x=str.nextDouble();
        y=str.nextDouble();
        if (x>=1&&y<=-1&&x<=3&&y>=-2)
            System.out.println("Принадлежит");
        else{
            System.out.println("Не принадлежит");
        }
    }
}
