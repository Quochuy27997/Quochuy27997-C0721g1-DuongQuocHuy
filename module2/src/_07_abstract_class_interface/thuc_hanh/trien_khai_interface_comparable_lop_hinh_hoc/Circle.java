package _07_abstract_class_interface.thuc_hanh.trien_khai_interface_comparable_lop_hinh_hoc;

import java.util.Arrays;

class Circle {
    private double radius;
    private String color;
    private Boolean filled;
    Circle(){}
    Circle(double radius,String color,Boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }

     public Circle(double radius) {
     }

     public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public String circleToString(){
        return "A Circle with radius"+
                getRadius()+
                ", color is "+
                getColor() +
                ", has Area " +
                getArea();
    }
}

