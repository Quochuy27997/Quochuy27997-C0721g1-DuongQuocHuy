package _11_dsa_stack_queue.bai_tap.to_chuc_du_lieu_hop_li;

public class Student {
    private String name;
    private String gender;
    private int age;

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return "name:"+getName()+
                " gender:"+getGender()+
                " age:"+getAge();
    }
}
