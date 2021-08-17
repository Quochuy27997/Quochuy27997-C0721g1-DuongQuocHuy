package _02_vong_lap_java.bai_tap;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int N = 2;
        while (N < 100) {
            if (checkSNT(N)) {
                System.out.println(N);
            }
            N++;
        }
    }

    public static boolean checkSNT(int N) {
        boolean check = true;
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}

