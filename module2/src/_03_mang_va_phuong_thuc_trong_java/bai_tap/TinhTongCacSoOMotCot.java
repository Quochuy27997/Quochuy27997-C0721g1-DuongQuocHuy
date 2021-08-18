package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoOMotCot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao kich thuoc n");
        int n = Integer.parseInt(input.nextLine());
//      System.out.println("nhap vao kich thuoc m");
        int m = Integer.parseInt(input.nextLine());
        int[][] array = new int[n][m];
        System.out.println("Enter " + array.length + " rows and " +
                array[0].length + " col: ");
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = Integer.parseInt(input.nextLine());
            }
        }
        System.out.println("Ma trận đã nhập vào là: ");
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("nhập vào cột cần tính tổng:");
        int a = Integer.parseInt(input.nextLine());
        int total=0;
        if(a<0||a> array.length){
            System.out.println("không thể tính được tổng cột không có trong ma trận");
        }else {
            for (int row=0;row<array.length;row++){
                total+=array[row][a];
            }
            System.out.println("tong các phần tử ở cột"+a+"là"+total);
        }
    }
}
