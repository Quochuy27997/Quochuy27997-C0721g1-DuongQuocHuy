package _06_ke_thua.bai_tap.lop_point_moveablepoint;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint.pointToString());


        moveablePoint = new MoveablePoint(7.5f, 8.5f);
        System.out.println(moveablePoint.pointToString());
        moveablePoint.move();
        System.out.println(moveablePoint.pointToString());

    }
}
