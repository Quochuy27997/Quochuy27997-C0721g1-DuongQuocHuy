package _05_access_modifier_static_method_static_property.bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class Student {
    private String name="Jonh";
    private  String classes="C02";
    public Student(){
        this.name=name;
        this.classes=classes;
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    void setClasses(String classes) {
        this.classes = classes;
    }

}
