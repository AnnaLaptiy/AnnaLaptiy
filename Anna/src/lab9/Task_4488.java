package lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task_4488 {
    public static void main(String[] args) {
        int t=0;
            for (int i = 1; i < 6; i++) {
                File target = new File("Anna/Res/task4488/test" + i + ".txt");
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
                            t=t+1;
                            System.out.print(", ");
                            System.out.print(t);
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

