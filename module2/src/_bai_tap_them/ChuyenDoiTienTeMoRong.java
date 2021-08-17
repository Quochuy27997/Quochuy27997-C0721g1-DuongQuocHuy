package _bai_tap_them;
import java.util.Scanner;
public class ChuyenDoiTienTeMoRong {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        final int menhgia= 23000;
        System.out.print("hay nhập lua chon cua minh : 1. VND->USD 2.USD->VND");
        int chon =scanner.nextInt();
        if(chon==1){
            System.out.print("hay nhập số tiền cần đổi");
            int vnd =scanner.nextInt();
            int usd =vnd/menhgia;
            System.out.print("số tiền USD là:"+usd+"USD");
        }else if(chon==2){
            System.out.print("hay nhập số tiền cần đổi");
            int usd =scanner.nextInt();
            int vnd =usd*menhgia;
            System.out.print("số tiền Vnd là:"+vnd+"Vnd");
        }
    }
}
