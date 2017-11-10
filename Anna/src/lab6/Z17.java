package lab6;

import java.util.Scanner;

public class Z17 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int sum=0, count=0, temp;
     //   while (true){
       //     temp=str.nextInt();
          //  if(temp==0) {
            //    return;
           // }
        //    sum+=temp;
        //    count++;

       // temp=str.nextInt();
      //  while (temp!=0){
     //       sum+=temp;
//            count++;
//            temp=str.nextInt();
//        }
//        System.out.print("Сумма чисел: ");
//        System.out.print(sum);
//        System.out.print(", Количество чисел: ");
//        System.out.print(count);
        do{
            temp=str.nextInt();
            sum=temp;
            count++;

        }
        while(temp!=0);
        System.out.print("Сумма чисел: ");
        System.out.print(sum);
        System.out.print(", Количество чисел: ");
        System.out.print(count);
            }


        }



