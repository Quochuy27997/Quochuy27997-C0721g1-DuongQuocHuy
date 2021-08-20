package _05_access_modifier_static_method_static_property.bai_tap.access_modifier;
import java.util.Scanner;
public class Circle {
    private double radius=1;
    private String color="red";



    //    public Circle(double radius){
//        this.radius=radius;
//    }
    public Circle(double radius,String color){
      this.radius=radius;
      this.color=color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
}
