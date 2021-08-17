package _03_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class GopMang {
    public static void main(String[] args) {
        int size1;
        int array1[];
        Scanner input1 = new Scanner(System.in);
        System.out.println("nhap do dai mang");
        size1 = Integer.parseInt(input1.nextLine());
        array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.println("nhap vao phan tu thu" + i);
            array1[i] = Integer.parseInt(input1.nextLine());
        }

        int size2;
        int array2[];
        Scanner input2 = new Scanner(System.in);
        System.out.println("nhap do dai mang");
        size2 = Integer.parseInt(input2.nextLine());
        array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.println("nhap vao phan tu thu" + i);
            array2[i] = Integer.parseInt(input2.nextLine());
        }
        System.out.println("cac phan tu cua mang 1:");
        for (int i = 0; i < size1; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("cac phan tu cua mang 2:");
        for (int i = 0; i < size2; i++) {
            System.out.println(array2[i]);
        }
        int size=size1+size2;
        int[] array3=new int[size];
        for(int i=0;i<array1.length;i++){
            array3[i]=array1[i];
        }
        for(int j=0;j< array2.length;j++){
            array3[array1.length+j]=array2[j];
        }
        System.out.println("mang sau khi gop 2 mang :");
        for (int i=0;i< array3.length;i++){
            System.out.println(array3[i]);
        }
    }
}
