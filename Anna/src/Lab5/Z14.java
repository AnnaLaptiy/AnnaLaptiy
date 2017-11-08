package Lab5;

import java.util.Scanner;

public class Z14 {
    public static void main(String[] args) {
        Scanner str=new Scanner (System.in);
        double x,y,z;
        x=str.nextDouble();
        y=str.nextDouble();
        z=str.nextDouble();
        if(-3<x&&x<5)
            System.out.print(x);
        else if (x>=-3||x>=5)
            System.out.print("");
        if(-3<y&&y<5)
            System.out.print(y);
        else if (y>=-3||y>=5)
            System.out.print("");
        if(-3<z&&z<5)
            System.out.print(z);
        else if (z>=-3||z>=5)
            System.out.print("");

    }
}
