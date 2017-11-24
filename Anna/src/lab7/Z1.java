package lab7;

import java.util.Scanner;

public class Z1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a ;
        boolean b;
        a=s.nextLine();
        String str="abcdefwxyz";
        b=str.contains(a);
        if(b){
            System.out.println("Содержится");
        }
        else
            System.out.println("Не содержится");
    }
}
