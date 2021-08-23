package _06_ke_thua.bai_tap.lop_circle_lop_cylinder;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);
        circle=new Circle(6.0,"yellow");
        System.out.println(circle.circleToString());

    }
}
