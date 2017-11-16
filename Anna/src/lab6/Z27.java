package lab6;

import java.util.Scanner;

public class Z27 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a,b,s=0,r;
        a=str.nextInt();
        b=str.nextInt();
        if (a>b)
            for( int i=b; i<=a; i++){
                r=i%7;
                if (r==0)
                    s=s+i;
            }
        else if(a<b)
            for(int i=a;i<=b; i++) {
                r=i%7;
                if (r==0)
                    s=s+i;
            }
        System.out.println(s);
    }
}
