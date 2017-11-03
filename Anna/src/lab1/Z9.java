package lab1;

import java.util.Scanner;

public class Z9 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String first;
        System.out.println("Напиши число ");
        first=str.nextLine();
        System.out.println( " SELECT first_name, last_name, group\n" +
                "FROM students WHERE student_id = "+ "'"+ first +"'");


    }
}
