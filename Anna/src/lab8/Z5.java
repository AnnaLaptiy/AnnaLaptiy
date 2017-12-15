package lab8;

import java.util.Scanner;

public class Z5 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int b = str.nextInt(), d = str.nextInt();
        if (b < 0 || b > 10)
            System.out.println("Число P должно быть в интервале [0, размер массива)");
        else if (d < 0 || d > 10)
            System.out.println("Число Q должно быть в интервале [0, размер массива)");
        else {

            int[] array = {1, 2, 3, 4, 1, 2};
            int temp = array[b];
            array[b] = array[d];
            array[d] = temp;
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
            }
        }
    }
}