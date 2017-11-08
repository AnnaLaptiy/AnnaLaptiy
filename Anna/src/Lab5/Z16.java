package Lab5;

import java.util.Scanner;

public class Z16 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int x,y,z;
        x=str.nextInt();
        y=str.nextInt();
        z=str.nextInt();
        if (x>y&&x>z)
            System.out.println(x);
        else if(y>x&&y>z)
            System.out.println(y);
        else if(z>x&&z>y)
            System.out.println(z);
    }
}
