package _13_thuat_toan_tim_kiem.bai_tap.cai_dat_thuat_toan_tim_kiem_nhi_pha_de_quy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap do dai mang");
        int sizeOfArray = Integer.parseInt(input.nextLine());
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println("hay nhap phan tu thu: " + i);
            array[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("mang sau khi nhap:"+Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("mang sau khi sap xep:"+Arrays.toString(array));

        System.out.println("nhap so can tim:");
        int number=Integer.parseInt(input.nextLine());
        int check=binarySearch(array,0,array.length-1,number);
        if (check==-1){
            System.out.println("khong tim thay so can tim");
        }else {
            System.out.println("so "+number+" o vi tri"+check );
        }
    }

    public static int binarySearch(int[] array, int left, int right, int value) {

        if (left < right) {
            int mid = (left + right) / 2;
            if (array[mid] == value) {
                return mid;
            }
            if (value < array[mid]) {
                return binarySearch(array, left, mid - 1, value);
            }
            if (value > array[mid]) {
               return binarySearch(array, mid + 1, right, value);
            }
        }
        return -1;
    }
}
