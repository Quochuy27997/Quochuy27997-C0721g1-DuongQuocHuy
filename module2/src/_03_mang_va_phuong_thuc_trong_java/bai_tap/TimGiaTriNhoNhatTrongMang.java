package _03_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class TimGiaTriNhoNhatTrongMang {
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
       int min= array[0];
        int vitri=0;
        for (int j=1;j< array.length;j++){
            if(min>array[j]){
                min=array[j];
                vitri=j;
            }
        }
        System.out.println("Phần tử nhỏ nhất của mảng là" + min + " , tại vị trí thứ " + vitri);

    }
}
