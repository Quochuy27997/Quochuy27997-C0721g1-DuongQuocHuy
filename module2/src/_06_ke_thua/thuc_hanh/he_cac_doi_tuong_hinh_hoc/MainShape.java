package _06_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class MainShape {
    public static void main(String[] args) {
        Shape shape= new Shape();
        System.out.println(shape);
        shape=new Shape("red",false);
        System.out.println(shape);
    }
}
