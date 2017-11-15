package lab6;

import java.util.Scanner;

public class Z19 {
    public static void main(String[] args) {
    Scanner str=new Scanner(System.in);
    int a, count=0, sum=0;
    do{
        a=str.nextInt();
if (a<=83)
    sum=sum+1;
else if (a>199)
    count = count+1;
    }while(a<=83||a>=199);

        System.out.print("Количество слева: "+ sum);
        System.out.print(", количество справа: " + count);
    }




}

