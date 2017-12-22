package lab8;

import java.util.Arrays;
import java.util.Scanner;

public class Z18 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a=str.nextLine();
        int T;
        int[] A = Arrays.stream(a.split(" ")).mapToInt(Integer::parseInt).toArray();

            System.out.print("Ход решения: \n" +
                    "Начинаю с "+ A[0]);
            System.out.println(" \n Сравниваю " +A[0]+" и "+A[1]);
            if(A[0]<A[1]){
                T=A[0];
                System.out.println("Заменяю");
            }
            else{
                T=A[1];

            }
        System.out.println("Сравниваю "+ T+ " and "+A[2]);
            if (A[1]<A[2]){
                T=A[1];
                System.out.println("Заменяю");
            }
            else{
                T=A[2];
            }
        System.out.println("Сравниваю "+ T+ " and "+A[3]);
        if (A[2]<A[3]){
            T=A[2];
            System.out.println("Заменяю");
        }
        else{
            T=A[3];
        }
        System.out.println("Сравниваю "+ T+ " and "+A[4]);
        if (A[3]<A[4]){
            T=A[3];
            System.out.println("Заменяю");
        }
        else{
            T=A[4];
        }
        System.out.println("Сравниваю "+ T+ " and "+A[5]);
        if (A[4]<A[5]){
            T=A[4];
            System.out.println("Заменяю");
        }
        else{
            T=A[5];
        }
        System.out.println("Сравниваю "+ T+ " and "+A[6]);
        if (A[4]<A[5]){
            T=A[4];
            System.out.println("Заменяю");
        }
        else{
            T=A[6];
        }
        System.out.println("Сравниваю "+ T+ " and "+A[7]);
        if (A[6]<A[7]){
            T=A[6];
            System.out.println("Заменяю");
        }
        else{
            T=A[7];
        }

        System.out.println("Сравниваю "+ T+ " and "+A[8]);
        if (A[7]<A[8]){
            T=A[7];
            System.out.println("Заменяю");
        }
        else{
            T=A[8];
        }
        System.out.println("\n Ответ: 1 "+T);


    }
}
