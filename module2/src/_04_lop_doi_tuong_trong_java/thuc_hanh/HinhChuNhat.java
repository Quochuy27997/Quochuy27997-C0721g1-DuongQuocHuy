package _04_lop_doi_tuong_trong_java.thuc_hanh;


import java.util.Scanner;

public class HinhChuNhat {
    double width;
    double height;


    public HinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ",height=" + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the height:");
        double height = Double.parseDouble(scanner.nextLine());
        HinhChuNhat rectangle = new HinhChuNhat(width, height);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }

}




