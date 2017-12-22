package lab9;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Task_6175 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            File target = new File("Anna/Res/task6175/test" + i + ".txt");
            System.out.println("\n" + target.getAbsolutePath());
//            File target = new File("Anna/Res/task6175/test1.txt");
            if (!target.exists()) {
                System.out.println("File " + target.getAbsolutePath() + " не существует! ");
            } else {
                try (Scanner str = new Scanner(target)) {
                    if (str.hasNext()) {
                        String line = str.nextLine();
                        System.out.print(line);
                    }
                    else{
                        System.out.println("Файл пуст");
                    }
                    while (str.hasNext()) {
                        String line = str.nextLine();
                        System.out.print(", ");
                        System.out.print(line);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}