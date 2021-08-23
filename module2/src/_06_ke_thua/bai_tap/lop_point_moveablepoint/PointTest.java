package _06_ke_thua.bai_tap.lop_point_moveablepoint;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.pointToString());
        point = new Point(5.5f,6.5f);
        System.out.println(point.pointToString());
    }
}
