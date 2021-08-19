package _04_lop_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

public class MainFan {
    public static void main(String[] args) {
        Fan Fan1=new Fan(3,true,10,"yellow");
        Fan Fan2=new Fan(2,false,5,"blue");
        System.out.println("quạt 1:"+Fan1.toString());
        System.out.println("quạt 2:"+Fan2.toString());
    }
}
