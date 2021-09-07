package _15_exeption_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
 public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3) throws IllegalRightTriangleException {
        if (side1 > 0 && side2 > 0 && side3 > 0) {
            if (side1 < side2 + side3 && side2 < side1 + side3 && side3 < side1 + side2) {
                System.out.println(side1 + ", " + side2 + ", " + side3 + " là 3 cạnh của 1 tam giác");
            } else {
                throw new IllegalRightTriangleException("Không thỏa mãng điều kiện 3 cạnh của 1 tam giác");
            }
        } else {
            throw new IllegalRightTriangleException("Cạnh tam giác phải là số dương");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public static void main(String[] args) throws IllegalRightTriangleException {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap canh 1:");
        int side1 = Integer.parseInt(input.nextLine());
        System.out.println("nhap canh 2:");
        int side2 = Integer.parseInt(input.nextLine());
        System.out.println("nhap canh 3:");
        int side3 = Integer.parseInt(input.nextLine());

        try {
            Triangle trinagle = new Triangle(side1, side2, side3);
            System.out.println();
        } catch (IllegalRightTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
