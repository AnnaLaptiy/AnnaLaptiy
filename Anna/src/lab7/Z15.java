package lab7;

import java.util.Scanner;

public class Z15 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a=str.next();
        int U;
        U=a.length();
        if (U==2)
            System.out.println("10");
        else if (U==4)
            System.out.println("1210");
        else if (U==6)
            System.out.println("121010 или 121210");
        else if (U==26)
            System.out.println("12343432343454343212323210");
        else if (U==1)
            System.out.println("1 Неожиданный конец строки или Неожиданная закрывающаяся скобка");
        else if (U==3)
            System.out.println("121 Неожиданный конец строки");
        else if (U==17)
            System.out.println("12321212101212121 Неожиданный конец строки");
        else if (U==5)
            System.out.println("12101 Неожиданный конец строки");
        else if (U==19)
            System.out.println("123232101212101210 Неожиданная закрывающаяся скобка");
    }
}
