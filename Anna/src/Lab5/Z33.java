package Lab5;

import java.util.Scanner;

public class Z33 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a;
        a=str.nextInt();
        if (a<0||a>59)
            System.out.println("Значение T должно быть в интервале [0, 59]");
        else{
            if (a==0||a<=2||a>=5&&a<8||a==13)
                System.out.println("Зеленый");
            else if (a<5||a>=58)
                System.out.println("Красный");

        }
    }
}
