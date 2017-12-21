package lab8;

import java.util.Scanner;

public class Z13 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a=str.nextLine();
        String[] A=a.split(" ");
        int O = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i].equals(A[j]))
                O=O+6;
                else
                    O=O+0;
            }
        }
                if (O>=1)
                    System.out.println("Есть совпадения");
                else if (O==0)
                    System.out.println("Нет совпадений");



}}
