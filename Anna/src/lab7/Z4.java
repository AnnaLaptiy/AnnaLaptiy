package lab7;

import java.util.Scanner;

public class Z4 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int i, t, P;
        String a, A="abcdacadbacdaabaadc";
        a=str.next();
        i=A.indexOf(a);
        t=A.indexOf(a,i+1);
        P=a.length();
        if(P>2||P<2)
            System.out.println("Вводимая строка должна содержать ровно 2 символа");
        else{
        System.out.print(i);
        System.out.print(" "+t);
        }
    }
}
