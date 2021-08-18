package _03_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class TinhTongDuongCheoChinhMaTranVuong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao kich thuoc n");
        int n = Integer.parseInt(input.nextLine());
        int[][] array = new int[n][n];
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
        int total=0;
        for(int row=0;row<array.length;row++){
            for (int col=0;col<array[row].length;col++){
                if(row==col){
                    total+=array[row][col];
                }

            }
        }
        System.out.println("tổng các đường chéo chính là:"+total);
    }
}
