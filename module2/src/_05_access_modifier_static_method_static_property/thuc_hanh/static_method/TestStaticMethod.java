package _05_access_modifier_static_method_static_property.thuc_hanh.static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student S1=new Student(111,"Hoang");
        Student S2=new Student(222,"Huy");
        Student S3=new Student(333,"Nam");
        S1.display();
        S2.display();
        S3.display();
    }
}
