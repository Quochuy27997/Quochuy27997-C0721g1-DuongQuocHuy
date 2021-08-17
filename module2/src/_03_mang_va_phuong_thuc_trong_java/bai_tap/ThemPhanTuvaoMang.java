package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuvaoMang {
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner input = new Scanner(System.in);
        System.out.println("nhap do dai mang");
        size = Integer.parseInt(input.nextLine());
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhap vao phan tu thu" + i);
            array[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("cac phan tu cua mang:");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
        int X = 0;
        int indexX = 0;
        System.out.println("nhap gia tri can the");
        X = Integer.parseInt(input.nextLine());
        System.out.println("nhap vao vi tri muon them");
        indexX = Integer.parseInt(input.nextLine());
        if (indexX <= -1 || indexX > array.length - 1) {
            System.out.println("Không thể thêm phần tử");
        }
        for (int i = 0; i < array.length; i++) {
            if (indexX == i) {
                array[i] = X;
            }
        }
        System.out.println("mang sau khi them :");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
