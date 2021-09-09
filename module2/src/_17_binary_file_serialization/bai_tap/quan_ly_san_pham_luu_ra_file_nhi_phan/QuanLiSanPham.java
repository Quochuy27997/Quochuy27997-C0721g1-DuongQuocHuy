package _17_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiSanPham {
    static List<SanPham> listSanPham = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    static {
        listSanPham.add(new SanPham(1, "hao hao", "abc", 4000, 500));
        listSanPham.add(new SanPham(2, "a one", "bcd", 5500, 300));
        listSanPham.add(new SanPham(3, "omachi", "asd", 8000, 200));
        listSanPham.add(new SanPham(4, "lau thai", "cde", 5000, 400));

    }

    public static void themSanPham() {
        System.out.println("nhap ma sp");
        int maSanPham = Integer.parseInt(input.nextLine());
        System.out.println("nhap ten sp");
        String tenSanPham = input.nextLine();
        System.out.println("nhap ten hang sx");
        String hangSanXuat = input.nextLine();
        System.out.println("nhap gia sp");
        int giaSanPham = Integer.parseInt(input.nextLine());
        System.out.println("nhap so luong");
        int soLuong = Integer.parseInt(input.nextLine());
        listSanPham.add(new SanPham(maSanPham, tenSanPham, hangSanXuat, giaSanPham, soLuong));

    }

    public static void hienThiSanPham() {
        for (SanPham sanPham : listSanPham) {
            System.out.println(sanPham.toString());
        }
    }

    public static void timKiemSanPham() {
        int count = 0;
        System.out.println("nhap ten san pham");
        String name = input.nextLine();
        for (int i = 0; i < listSanPham.size(); i++) {
            if (name.equals(listSanPham.get(i).getTenSanPham())) {
                System.out.println(listSanPham.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("san pham khong co trong danh sach");
        }


    }

    public static void XoaSP() {
        System.out.println("hay nhap ten san pham can xoa");
        String tenSanPhamXoa = input.nextLine();
        boolean check = false;
        for (int i = 0; i < listSanPham.size(); i++) {
            if (tenSanPhamXoa.equals(listSanPham.get(i).getTenSanPham())) {
                check = true;
                listSanPham.remove(i);
                break;
            }
        }
        if (!check) {
            System.out.println("ten sp ban nhap k co trong danh sach");
        }
    }

    public static void main(String[] args) {
        int choice = -1;
        while (choice != 5) {
            System.out.println("Menu");
            System.out.println("1.hien thi sp");
            System.out.println("2.them thi sp");
            System.out.println("3.xoa thi sp");
            System.out.println("4.tim kiem thi sp");
            System.out.print("moi ban nhap lua chon:");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    hienThiSanPham();
                    break;
                case 2:
                    themSanPham();
                    break;
                case 3:
                    XoaSP();
                    break;
                case 4:
                    timKiemSanPham();
                    break;
            }
        }
    }
}
