package _07_abstract_class_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.model;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
//    @Override
//    public void resize (double percent) {
//        setWidth(getWidth() * (1 + percent / 100));
//        setLength(getLength() * (1 + percent / 100));
//    }
    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of Rectangle "
                + ", has perimeter : "+
                getPerimeter()+
                ", and area: "+
                getArea();
    }
}
