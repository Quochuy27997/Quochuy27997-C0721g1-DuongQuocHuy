package _05_access_modifier_static_method_static_property.bai_tap.xay_dung_lop_chi_ghi_trong_java;
import java.util.Scanner;
public class TestStudent {
    public static void main(String[] args) {
        Student student=new Student();
        Scanner input=new Scanner(System.in);
        System.out.println("nhap ten hoc sinh ");
        String nameOfStudent=input.nextLine();
        System.out.println("nhap lop");
        String classesOfStudent=input.nextLine();
        student.setName(nameOfStudent);
        student.setClasses(classesOfStudent);


        System.out.println("ho va ten "+ student.getName()+" lop "+student.getClasses());

    }

}
