package _17_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

public class SanPham {
    private int maSanPham;
    private String tenSanPham;
    private String hangSanXuat;
    private double giaSanPham;
    private int soLuong;

    public SanPham(){

    }


    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public SanPham(int maSanPham, String tenSanPham, String hangSanXuat, double giaSanPham, int soLuong) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.giaSanPham = giaSanPham;
        this.soLuong=soLuong;
    }
    @Override
    public String toString(){
        return "SanPham{" +
                "maSanPham=" + maSanPham +
                ", tenSanPham='" + tenSanPham +
                ", hangSanXuat='" + hangSanXuat +
                ", gia=" + giaSanPham +
                '}';
    }
}
