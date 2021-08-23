package bai_lam_them_fix_bug;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Chọn chức năng\n" +
                    "1.Add\n" +
                    "2.delete\n" +
                    "3.show\n" +
                    "4.Exit");
            System.out.println("Chọn");
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    StudentManager.add();
                    break;
                case 2:
                    StudentManager.delete();
                    break;
                case 3:
                    StudentManager.display();
                case 4:
                    System.exit(0);
            }
        }
    }
}
