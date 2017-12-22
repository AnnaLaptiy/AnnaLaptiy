package lab8;

import java.util.Arrays;
import java.util.Scanner;

public class Z16 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a=str.nextLine();
        String b=str.nextLine();
        int t;
        int[] R = Arrays.stream(a.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] D = Arrays.stream(b.split(" ")).mapToInt(Integer::parseInt).toArray();
        if(R.length>D.length||R.length<D.length){
            System.out.println("Размеры массивов должны быть одинаковы");}
            else{
        for(int i=0;i<R.length; i++){
            for (int y=0; y<D.length; y++){
                int T=R[i]*D[i];

                System.out.print(T+" ");
            }
        }
    }}
}
