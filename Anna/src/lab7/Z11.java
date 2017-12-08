package lab7;

import java.util.Scanner;

public class Z11 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a = str.nextLine(), b;
int r;
r=a.length()-1;
        b=a.substring(1,r);
        if (a.startsWith("\"")&& a.endsWith("\""))
            System.out.println(b.trim());
        else
        System.out.println("Строка должна начинаться и заканчиваться кавычкой");









    }
}
