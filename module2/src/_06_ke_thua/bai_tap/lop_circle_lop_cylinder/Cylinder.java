package _06_ke_thua.bai_tap.lop_circle_lop_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    ;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }

    @Override
    public String circleToString() {
        return "A cylinder with" +
                super.circleToString()
                + ", height="
                + getHeight()
                +", has Volume "
                + getVolume();
    }
}
