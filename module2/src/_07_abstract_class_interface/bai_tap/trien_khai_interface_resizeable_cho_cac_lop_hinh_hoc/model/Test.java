package _07_abstract_class_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.model;
import java.util.Scanner;
public class Test {
    public static Shape getRandomShape() {
        int random = (int) (Math.round(Math.random() * 5));
        switch (random) {
            case 0:
                return new Circle(2.5);
            case 1:
                return new Rectangle(4.5, 3.5);
            default:
                return new Square(5.5);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn tạo ra bao nhiêu hình: ");
        int size = Integer.parseInt(scanner.nextLine());
        Shape[] shapes = new Shape[size];
        for (int i = 0; i < size; i++) {
            shapes[i] = getRandomShape();
        }
        System.out.println("Trước khi thay đổi kích thước: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Circle) {
                System.out.println("Diện tích trước khi thay đổi kích thước là: " + ((Circle) shape).getArea());
            }
            if (shape instanceof Rectangle) {
                System.out.println("Diện tích trước khi thay đổi kích thước là: " + ((Rectangle) shape).getArea());
            }
        }

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                ((Circle) shape).resize(Math.random() * 100);
            }
            if (shape instanceof Rectangle) {
                ((Rectangle) shape).resize(Math.random() * 100);
            }
            if (shape instanceof Square) {
                ((Square) shape).resize(Math.random() * 100);
            }
        }

        System.out.println();

        System.out.println("Sau khi thay đổi kích thước: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Circle) {
                System.out.println("Diện tích sau khi thay đổi kích thước là: " + ((Circle) shape).getArea());
            }
            if (shape instanceof Rectangle) {
                System.out.println("Diện tích sau khi thay đổi kích thước là: " + ((Rectangle) shape).getArea());
            }
        }


    }
}