package _05_access_modifier_static_method_static_property.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle(100,"blue");
        System.out.println("dien tich hinh tron co ban kinh "+circle.getRadius()+" la "+circle.getArea()+"va mau la "+circle.getColor());
        circle.setRadius(50);
        circle.setColor("yellow");
        System.out.println("dien tich hinh tron co ban kinh "+circle.getRadius()+" la "+circle.getArea()+"va mau la "+circle.getColor());
    }
}
