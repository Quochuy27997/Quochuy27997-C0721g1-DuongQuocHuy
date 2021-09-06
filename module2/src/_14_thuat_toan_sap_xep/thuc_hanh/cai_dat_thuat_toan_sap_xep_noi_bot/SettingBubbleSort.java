package _14_thuat_toan_sap_xep.thuc_hanh.cai_dat_thuat_toan_sap_xep_noi_bot;

public class SettingBubbleSort {
    static int[] list = {1, 3, 2, 4, 7, 4, 9, 6};

    public static void bubleSort(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }


    public static void main(String[] args) {
        bubleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
