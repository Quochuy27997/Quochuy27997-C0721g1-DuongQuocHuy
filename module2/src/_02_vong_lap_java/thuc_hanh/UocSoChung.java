package _02_vong_lap_java.thuc_hanh;
import java.util.Scanner;
public class UocSoChung {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input= new Scanner(System.in);
        System.out.println("nhap vao so a");
        a = Integer.parseInt(input.nextLine());
        System.out.println("nhap vao so b");
        b = Integer.parseInt(input.nextLine());
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
