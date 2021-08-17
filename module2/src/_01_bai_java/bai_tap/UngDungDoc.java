package _02_vong_lap_java.thuc_hanh;

import java.util.Scanner;

public class UngDungDoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc (tối đa ba chữ số): ");
        int so = scanner.nextInt();
        if (so < 0 || so > 999) {
            System.out.println("Không thể đọc");
        } else {
            int donvi = so % 10;
            so /= 10;
            int chuc = so % 10;
            int tram = so / 10;
            String a = "";
            String b = "";
            String c = "";
            switch (donvi) {
                case 1:
                    a = "một";
                    break;
                case 2:
                    a = "hai";
                    break;
                case 3:
                    a = "ba";
                    break;
                case 4:
                    a = "bốn";
                    break;
                case 5:
                    a = "năm";
                    break;
                case 6:
                    a = "sáu";
                    break;
                case 7:
                    a = "bảy";
                    break;
                case 8:
                    a = "tám";
                    break;
                case 9:
                    a = "chín";
                    break;
            }
            switch (chuc) {
                case 0:
                    if (tram != 0 && donvi != 0) {
                        b = "lẻ ";
                        break;
                    }else {
                        b = "";
                        break;
                    }
                case 1:
                    b = "mười ";
                    break;
                case 2:
                    b = "hai mươi ";
                    break;
                case 3:
                    b = "ba mươi ";
                    break;
                case 4:
                    b = "bốn mươi ";
                    break;
                case 5:
                    b = "năm mươi ";
                    break;
                case 6:
                    b = "sáu mươi ";
                    break;
                case 7:
                    b = "bảy mươi ";
                    break;
                case 8:
                    b = "tám mươi ";
                    break;
                case 9:
                    b ="chín mươi ";
                    break;
            }
            switch (tram) {
                case 0:
                    c = "";
                    break;
                case 1:
                    c = "một trăm ";
                    break;
                case 2:
                    c = "hai trăm ";
                    break;
                case 3:
                    c = "ba trăm ";
                    break;
                case 4:
                    c = "bốn trăm ";
                    break;
                case 5:
                    c = "năm trăm ";
                    break;
                case 6:
                    c = "sáu trăm ";
                    break;
                case 7:
                    c = "bảy trăm ";
                    break;
                case 8:
                    c = "tám trăm ";
                    break;
                case 9:
                    c = "chín trăm ";
                    break;
            }
            System.out.println(c + b + a);
        }

    }
}

