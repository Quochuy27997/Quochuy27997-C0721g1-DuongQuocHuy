package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimPhanTuLonNhatMangHaiChieu {
    public static void main(String[] args) {
        Scanner inputn = new Scanner(System.in);
        System.out.println("nhap vao kich thuoc n");
        int n = Integer.parseInt(inputn.nextLine());
        Scanner inputm = new Scanner(System.in);
        System.out.println("nhap vao kich thuoc m");
        int m = Integer.parseInt(inputm.nextLine());
        int[][] array = new int[n][m];
        System.out.println("Enter " + array.length + " rows and " +
                array[0].length + " col: ");
        Scanner input = new Scanner(System.in);
        for(int row=0;row<array.length;row++){
            for(int col=0;col<array[row].length;col++){
                array[row][col]= Integer.parseInt(input.nextLine());
            }
        }
        System.out.println("Ma trận đã nhập vào là: ");
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
        int max = array[0][0];
        int x=0;
        int y=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]>max){
                    max=array[i][j];
                    x=i;
                    y=j;
                }
            }
        }

        System.out.println(" Phần tử lớn nhất của ma trận là: " +max+"tai vi tri"+x+","+y);
    }
}
