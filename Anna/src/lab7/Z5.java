package lab7;
import java.util.Scanner;
public class Z5 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a= "abcdefwxyz";
        int A, B, s;
        s=a.length();
        A=str.nextInt();
        B=str.nextInt();
        if(A>B)
            System.out.println("Значение CA должно быть меньше CB");
        else if(A<0)
            System.out.println("Значение CA должно быть в интервале [0,длина строки)");
        else if(B<0)
            System.out.println("Значение CB должно быть в интервале [0,длина строки)");
        else if(B>s)
            System.out.println("Значение CB должно быть в интервале [0,длина строки)");
        else{
            String k=a.substring(A,B+1);
            System.out.println(k);
        }
    }
        }



