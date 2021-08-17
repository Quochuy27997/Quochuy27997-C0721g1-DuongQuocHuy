package _02_vong_lap_java.bai_tap;
import java.util.Scanner;
public class DemSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong canf dem");
        int numbers = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int N = 2;
        while (count<numbers){
            if(checkSNT(N)){
                System.out.println(N);
                count++;
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
