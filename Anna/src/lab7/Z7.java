package lab7;

import java.util.Scanner;

public class Z7 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a;
        int L,s=1,f=3, s1=4, f1=7, s2=8, f2=12, s3=12, f3=13;
        a=str.next();
       L = a.length();
       if (L>13||L<13)
           System.out.println("Некорректная длина штрих-кода");
       else{
           char buf[]=new char[f-s];
           a.getChars(s,f,buf,0);
           System.out.print("Код страны: ");
           System.out.print(buf);

           System.out.println();

           char buf1[]=new char[f1-s1];
           a.getChars(s1,f1,buf1,0);
           System.out.print("Код изготовителя:  ");
           System.out.print(buf1);

           System.out.println();

           char buf2[]=new char[f2-s2];
           a.getChars(s2,f2,buf2,0);
           System.out.print("Код товара:  ");
           System.out.print(buf2);

           System.out.println();

           char buf3[]=new char[f3-s3];
           a.getChars(s3,f3,buf3,0);
           System.out.print("Контрольное число:  ");
           System.out.print(buf3);
       }




    }
}
