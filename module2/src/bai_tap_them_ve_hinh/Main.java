package bai_tap_them_ve_hinh;

public class Main {
    private static final String STAR = "*";

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 0 || (i == 1 && (j == 1 || j == 4 || j == 7)) || (i == 2 && (j == 2 || j == 4 || j == 6)) || (i == 3 && (j == 3 || j == 4 || j == 5)) || (i == 4 && j == 4)) {
                    System.out.print(STAR);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
        }
    }
}