package Lab5;

import java.util.Scanner;

public class Z29 {
    public static void main(String[] args) {
        Scanner str=new Scanner (System.in);
        int X,Y;
        X=str.nextInt();
        Y=str.nextInt();
        if (X<0)
            System.out.println("Координата X должна быть неотрицательной");
        else if (Y<0)
            System.out.println("Координата Y должна быть неотрицательной");
        else{
            if(X>=100&&X<=190&&Y>=100&&Y<=170)
                System.out.println("Точка внутри");
            else
                System.out.println("Точка снаружи");
        }
    }
}
