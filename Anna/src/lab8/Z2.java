package lab8;

import java.util.Scanner;

/**
 * Created by pro-28 on 15.12.2017.
 */
public class Z2 {
    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);
        String s = str.nextLine();
        String[] Arr = s.split(" ");
        for (int i = 0; i < Arr.length; i++){
            System.out.println(Arr [i]+ " " +i);
        }
    }
}
