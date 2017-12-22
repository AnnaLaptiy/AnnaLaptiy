package lab8;

import java.util.Arrays;
import java.util.Scanner;

public class Z17 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a=str.nextLine();
        int T=str.nextInt(), O=0;
        if (T>=10||T<0){
            System.out.println("Число B должно быть в интервале [0, размер массива)");}
        else {
            int[] A = Arrays.stream(a.split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int i = 0; i < A.length; i++) {
                if (A[i] >= T) {
                    O = O + 1;
                } else {
                    O = O + 0;
                }
            }
            System.out.println(O);
        }
    }
}
