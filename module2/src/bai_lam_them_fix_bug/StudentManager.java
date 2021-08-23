package bai_lam_them_fix_bug;

import java.util.Scanner;

public class StudentManager {
    public static Student[] studentList = new Student[100];

    static {
        studentList[0] = new Student("chanh", 18, (Adress) null);
        studentList[1] = new Student("chanh1", 19, (Adress) null);
        studentList[2] = new Student("chanh2", 20, (Adress) null);

    }

    public static void add() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập  tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập dia chi");
        String houseNumber = scanner.nextLine();
        System.out.println("nhập duong");
        String stress = scanner.nextLine();
        System.out.println("nhập phuong");
        String ward = scanner.nextLine();
        System.out.println("nhập quan");
        String district = scanner.nextLine();
        System.out.println("nhập tp");
        String province = scanner.nextLine();
        String[] adress = new String[5];
        adress[0]=houseNumber;
        adress[1]=stress;
        adress[2]=ward;
        adress[3]=district;
        adress[4]=province;

        Student student = new Student(name, age,adress);
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                studentList[i] = student;
                break;
            }
        }
    }

    public static void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên");
        String namedelete = scanner.nextLine();
        for (int i = 0; i < 100; i++) {
            if (studentList[i].getName().equals(namedelete)) {
                for (int j = 0; j < 99; j++) {
                    studentList[j]=studentList[j+1];
                }
                break;
            }
        }

    }


    public static void display() {
        for (int i = 0; i < studentList.length - 1; i++) {
            if (studentList[i] != null) {
                System.out.println(studentList[i].toString());
            }

        }
    }
}
