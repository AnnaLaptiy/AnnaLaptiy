package lab8;
import java.util.Scanner;
public class Z6 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a=str.nextLine();
        String[] srr = a.split(" ");
        String f = srr[srr.length-1];
//        srr[5]=srr[4];
//        srr[4] = srr[3];
//        srr[3]=srr[2];
//        srr[2]=srr[1];
//        srr[1]=srr[0];
        for (int  i=srr.length-1; i>0; i--){
            srr[i]=srr[i-1];
        }
        srr[0]=f;

        for (int i=0; i<srr.length; i++)
            System.out.print(srr[i] + " ");
    }
}


