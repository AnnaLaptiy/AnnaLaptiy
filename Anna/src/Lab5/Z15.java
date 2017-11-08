package Lab5;

import java.util.Scanner;

public class Z15 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int x,y,z;
        x=str.nextInt();
        y=str.nextInt();
        z=str.nextInt();
        if (x<=0)
            System.out.println("Значение A должно быть неотрицательным");
        else if (y<=0)
            System.out.println("Значение B должно быть неотрицательным");
        else if (z<=0)
            System.out.println("Значение C должно быть неотрицательным");
        else if (x==y||x==z||y==z)
            System.out.println("Треугольник является равнобедренным.");
        else
            System.out.println("Треугольник не является равнобедренным.");
    }
}
