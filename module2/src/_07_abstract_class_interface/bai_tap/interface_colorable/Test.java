package _07_abstract_class_interface.bai_tap.interface_colorable;
import java.util.Scanner;
public class Test {
    public static Shape getRandomShape(){
        int random=(int) (Math.round(Math.random()*5));
        switch (random){
            case 0:
                return new Circle(2.5);
            case 1:
                return new Rectangle(4.5, 3.5);
            default:
                return new Square(5.5);
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ban muon tao bao nhieu hinh");
        int size= Integer.parseInt(input.nextLine());
        Shape[] shapes=new Shape[size];
        for (int i = 0; i < size; i++) {
            shapes[i] = getRandomShape();
        }
        for (Shape shape:shapes){
            System.out.println(shape);
            if(shape instanceof Circle){
                System.out.println("co dien tich la"+((Circle)shape).getArea());
            }
            if (shape instanceof Rectangle) {
                System.out.println("Có diện tích là: " + ((Rectangle) shape).getArea());
            }
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
            System.out.println();
        }
    }
}
