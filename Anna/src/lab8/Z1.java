package lab8;

import java.util.Scanner;

public class Z1 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String s = str.nextLine();
        int a = str.nextInt();

        String[] srr = s.split(" ");
        if (a < 0 || a > srr.length)
            System.out.println("Число A должно быть в интервале [0, размер массива)");

        else if (s.equals("")) {
            System.out.println("Исходная строка пуста");
        } else {
            System.out.println(srr[a]);
        }
    }
}

