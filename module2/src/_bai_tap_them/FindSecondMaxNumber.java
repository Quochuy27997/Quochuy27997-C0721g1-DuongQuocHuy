package _bai_tap_them;

import java.util.Scanner;

public class FindSecondMaxNumber {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a size:");
        size = Integer.parseInt(scanner.nextLine());
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element" + (i + 1) + ":");
            array[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        System.out.println("property list:");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];

        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
        int max2 = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max2 && max > max2 && max > array[j]) {
                max2 = array[j];
            }
        }
        System.out.println("Số lớn thứ 2: " + max2);


    }

}


