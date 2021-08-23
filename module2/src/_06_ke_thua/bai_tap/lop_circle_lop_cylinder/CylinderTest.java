package _06_ke_thua.bai_tap.lop_circle_lop_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.circleToString());

        cylinder = new Cylinder(5.5,10.5,"blue");
        System.out.println(cylinder.circleToString());



    }
}
