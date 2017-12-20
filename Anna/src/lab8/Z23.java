package lab8;

import java.util.Scanner;

public class Z23 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String k=str.nextLine();
        String arr =str.nextLine();
        char ch = k.charAt(0);
        int cnt = 0;
        for(int i = 0; i < arr.length(); i++) {
            if( arr.charAt(i) == ch)
                cnt++;
        }
        System.out.print(cnt);
    }
}
