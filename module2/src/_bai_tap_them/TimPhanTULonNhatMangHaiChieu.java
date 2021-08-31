package _bai_tap_them;

import java.util.Scanner;

public class TimPhanTULonNhatMangHaiChieu {
    public static void main(String[] args) {
        int soDong, soCot, max = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của mảng: ");
        soDong = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        soCot = scanner.nextInt();
        int[][] A = new int[soDong][soCot];

        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

//        public static int[] findMax(){
//            int[] B = new int[soDong];
//            for (int i = 0; i < soDong; i++) {
//                max = A[i][0];
//                for (int j = 0; j < soCot; j++) {
//                    if (A[i][j] > max) {
//                        max = A[i][j];
//                    }
//                    B[i] = max;
//                }
//            }
//        }


    }

}
