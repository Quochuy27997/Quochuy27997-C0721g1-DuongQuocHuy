package _14_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Arrays;

public class MinhHoaThuatToanSapXepChen {
    public static void insertSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
            System.out.println("Setup " + i + ":");
            System.out.println(Arrays.toString(list));
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] list = {3, -5, 2, 1, 4, 5, -7};
        insertSort(list);
        System.out.println("List after insert sort: " + Arrays.toString(list));
    }
}
