package lab1;

import java.util.Scanner;

public class Z12 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String user, pass, host, port, db;
        System.out.println("user- ");
        user=str.nextLine();
        System.out.println("pass- ");
        pass=str.nextLine();
        System.out.println("host- ");
        host=str.nextLine();
        System.out.println("port - ");
        port=str.nextLine();
        System.out.println("db-");
        db=str.nextLine();
        System.out.println("User ID="+user+";Password= "+pass+";");
        System.out.println("Host= "+host+";Port= "+port+";Database= "+db+";");
    }
}
