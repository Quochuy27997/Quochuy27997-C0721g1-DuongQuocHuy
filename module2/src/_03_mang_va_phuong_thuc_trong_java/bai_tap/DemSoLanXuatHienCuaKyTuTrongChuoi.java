package _03_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("nhap vao chuoi ky tu bat ky");
        String string=input.nextLine();
        System.out.println("nhap vao ky tu can tim");
        char a=input.nextLine().charAt(0);
        int count=0;

        for(int i=0;i<string.length();i++){
            if(string.charAt(i)==a){
                count++;
            }
        }
        System.out.println("so lan xuat hien cua ky tu"+"a"+"trong chuoi"+string+"là"+count);
    }
}
