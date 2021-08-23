package _06_ke_thua.bai_tap.lop_2d_3d;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D=new Point3D();
        System.out.println(point3D.point2DToString());
        point3D=new Point3D(5.5f,6.5f,7.5f);
        System.out.println(point3D.point2DToString());
    }
}
