package lab6;

public class Z10 {
    public static void main(String[] args) {
        int sum;
        sum=0;
        System.out.print("Ход решения:");
        for(int i=100;i<=500; i++){
            sum = sum+i;
            System.out.print(" ");
            System.out.print(sum);
        }
        System.out.print("\nОтвет:");
        System.out.print(sum);
    }
}
