package Lab5;

import java.util.Scanner;

public class Z5 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        float a,b,c,d;
        a=str.nextFloat();
        b=str.nextFloat();
        c=a*1000f;
        d=b*0.305f;
        if (a<0)
            System.out.println("Значение distanceInKm должно быть неотрицательным");
        else if (b<0)
            System.out.println("Значение distanceInFeet должно быть неотрицательным");
        else if (c>d)
            System.out.println("Расстояние в футах меньше");
        else if(d>c)
            System.out.println("Расстояние в километрах меньше");

    }
}
