package _11_dsa_stack_queue.bai_tap.to_chuc_du_lieu_hop_li;

import java.util.*;

public class SetStudent {
    static List<Student> students = new ArrayList<>();
    static List<Student> setStudents = new ArrayList<>();

    static {
        Student student1 = new Student("Huy", "Nam", 24);
        Student student2 = new Student("Nhật", "Nam", 23);
        Student student3 = new Student("Lan", "Nữ", 20);
        Student student4 = new Student("Hiền", "Nữ", 26);
        Student student5 = new Student("Tiến", "Nam", 27);

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
        Queue<Student> nu = new LinkedList();
        Queue<Student> nam = new LinkedList();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGender().equals("Nữ")) {
                nu.add(students.get(i));
            } else {
                nam.add(students.get(i));
            }
        }
        while (!nu.isEmpty()) {
            setStudents.add(nu.remove());
        }
        while (!nam.isEmpty()) {
            setStudents.add(nam.remove());
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
