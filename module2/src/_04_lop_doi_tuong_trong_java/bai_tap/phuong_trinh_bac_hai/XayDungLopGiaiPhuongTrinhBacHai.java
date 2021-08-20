package _04_lop_doi_tuong_trong_java.bai_tap.phuong_trinh_bac_hai;
import java.util.Scanner;
public class XayDungLopGiaiPhuongTrinhBacHai {

    public double a;
    public double b;
    public double c;

    public XayDungLopGiaiPhuongTrinhBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA() {
        this.a = a;
    }

    public void setB() {
        this.b = b;
    }

    public void setC() {
        this.c = c;
    }

    public double getDiscriminant() {
        return ((this.b * this.b) - (4 * this.a * this.c));
    }

    public double getRoot1() {
        if (this.getDiscriminant() >= 0) {
            return ((-this.b - (Math.sqrt(this.getDiscriminant()))) / (2 * this.a));
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (this.getDiscriminant() >= 0) {
            return ((-this.b + (Math.sqrt(this.getDiscriminant()))) / (2 * this.a));
        } else {
            return 0;
        }

    }

    public void getRoot() {
        if (this.getDiscriminant() < 0) {
            System.out.println("phương trình vô nghiệm");
        } else if (this.getDiscriminant() == 0) {
            System.out.println("phương trình có nghiệm kép x1=x2=" + this.getRoot1());
        } else {
            System.out.println("phương trình có nghiệm x1=" + this.getRoot1() + "và x2=" + this.getRoot2());
        }
    }
}




