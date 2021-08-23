package _06_ke_thua.bai_tap.lop_2d_3d;

public class Point2DTest {
    public static void main(String[] args) {
        PointD point2D = new PointD();
        System.out.println(point2D.point2DToString());
        point2D = new PointD(5.5f, 10.5f);
        System.out.println(point2D.point2DToString());
    }
}
