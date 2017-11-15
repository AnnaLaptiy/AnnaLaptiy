package lab6;

import java.util.Scanner;

public class Z18 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a, count=0, sum=0;
        do{
            a=str.nextInt();
            count=a+count;
            sum=sum+1;

        }while(count<1001);
        System.out.print(sum);



    }
}
