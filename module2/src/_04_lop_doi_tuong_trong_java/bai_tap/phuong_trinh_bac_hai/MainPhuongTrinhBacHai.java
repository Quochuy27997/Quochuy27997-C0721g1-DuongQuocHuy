package _04_lop_doi_tuong_trong_java.bai_tap.phuong_trinh_bac_hai;
import java.util.Scanner;
public class MainPhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("tìm nghiem phuong trinh ax2+bx+c");
        System.out.println("nhập a");
        double a=Double.parseDouble(input.nextLine());
        System.out.println("nhập b");
        double b=Double.parseDouble(input.nextLine());
        System.out.println("nhập c");
        double c=Double.parseDouble(input.nextLine());
        XayDungLopGiaiPhuongTrinhBacHai xayDungLopGiaiPhuongTrinhBacHai=new XayDungLopGiaiPhuongTrinhBacHai(a,b,c);
        xayDungLopGiaiPhuongTrinhBacHai.getRoot();

    }
}
