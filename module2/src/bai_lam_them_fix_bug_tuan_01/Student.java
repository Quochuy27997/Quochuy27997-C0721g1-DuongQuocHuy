package bai_lam_them_fix_bug_tuan_01;

public class Student {
    private static String school = "Codegym";
    private String name;
    private int AGE;
    private Adress adress;

    public Student() {

    }

    public Student(String name, int age, String[] adress) {
    }


    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    public Student(String name, int AGE) {
        this.name = name;
        this.AGE = AGE;

    }

    public Student(String name, int AGE, Adress adress) {
        this.name = name;
        this.AGE = AGE;
        this.adress = adress;
    }


    public String getAdress() {
        return "{"+
                "so nha"+ Adress.getHouseNumber()+
                "duong"+Adress.getStress()+
                "phuong"+Adress.getWard()+
                "quan"+Adress.getDistrict()+
                "tp"+Adress.getProvince();
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

//    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", AGE=" + getAGE() +
                ",adress="+getAdress()+
                '}';
    }
}
