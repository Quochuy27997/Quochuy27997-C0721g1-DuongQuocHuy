package _04_lop_doi_tuong_trong_java.thuc_hanh;

import java.awt.*;

public class HinhChuNhat {
    double width;
    double height;
    public Rectangle(){
    }
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }
    public String display(){
        return "Rectangle{"+"width="+width+",height="+height+"}";
    }
}
