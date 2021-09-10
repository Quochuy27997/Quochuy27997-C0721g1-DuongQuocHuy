package _19_string_regex.bai_tap.validate_ten_lop_hoc;

public class NameClassTest {
    public static void main(String[] args) {
        NameClass nameClass=new NameClass();
        String[] nameClass2=new String[]{"C0721G","C0320G","A0519L"};
        String[] nameClass1=new String[]{"M0318G","P0323A","A0323A"};
        for(String name:nameClass2){
            boolean isvalid = nameClass.validate(name);
            System.out.println("Email is " + name +" is valid: "+ isvalid);
        }
        for (String name : nameClass1) {
            boolean isvalid = nameClass.validate(name);
            System.out.println("Email is " + name +" is valid: "+ isvalid);
        }
        }
    }


