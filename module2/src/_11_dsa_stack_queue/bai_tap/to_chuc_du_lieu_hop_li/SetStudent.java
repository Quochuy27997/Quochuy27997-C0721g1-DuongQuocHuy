package _11_dsa_stack_queue.bai_tap.to_chuc_du_lieu_hop_li;

import java.util.*;

public class SetStudent {
    static List<Student> students = new ArrayList<>();
    static List<Student> setStudents = new ArrayList<>();

    static {
        Student student1 = new Student("Huy", "male", 24);
        Student student2 = new Student("Nhat", "male", 23);
        Student student3 = new Student("Lan", "female", 20);
        Student student4 = new Student("Hien", "female", 26);
        Student student5 = new Student("Tien", "male", 27);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
    }

    public static void display() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(i+1+"."+students.get(i));
        }
    }

    public static void setDisplay() {
        Queue<Student> female = new LinkedList();

        Queue<Student> male = new LinkedList();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGender().equals("female")) {
                female.add(students.get(i));
            } else {
                male.add(students.get(i));
            }
        }
        while (!female.isEmpty()) {
            setStudents.add(female.remove());
        }
        while (!male.isEmpty()) {
            setStudents.add(male.remove());
        }
        for (int i = 0; i < setStudents.size(); i++) {
            System.out.println(i + 1 + "." + setStudents.get(i));
        }
    }

    public static void main(String[] args) {
        SetStudent.display();
        System.out.println("Set display: ");
        SetStudent.setDisplay();

    }


}
