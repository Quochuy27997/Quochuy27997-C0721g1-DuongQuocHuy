package _01_bai_java.bai_tap;
import java.util.Scanner;
public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        final int MENH_GIA= 23000;
        System.out.print("hay nhập số tiền cần đổi");
        int usd =scanner.nextInt();
        int vnd =usd*MENH_GIA;
        System.out.print("số tiền Vnd là:"+vnd+"Vnd");
    }
}
