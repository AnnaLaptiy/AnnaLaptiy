package lab8;

import java.util.Scanner;

public class Z12 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a=str.nextLine();
        String b=str.nextLine();
        String[] A=a.split(" ");
        String[]B=b.split(" ");
        int O = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i].equals(A[j]))
                    O=O+1;
                else
                    O=O+0;
            }
        }
        if (O>=1)
            System.out.println("Совпадений: "+O);
        else if (O==0)
            System.out.println("Нет совпадений");



    }
}
