package lab8;


import java.util.Scanner;

public class Z6 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);

        int[] addArray = {2}; //что запишем в начале массива
        int offset = addArray.length;
        int a[] = {1, 2, 3, 4, 1, 2}; //Массив, который будем сдвигать
        int b[] = new int[a.length + offset];
        System.out.print("Массив  до   сдвига: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            b[i + offset] = a[i];
            a[i] = b[i];
        }
        System.out.println();
        for (int i = 0; i < offset; i++) {
            a[i] = addArray[i];
        }
        System.out.print("Массив после сдвига: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }}


