package _11_dsa_stack_queue.bai_tap.kiem_tra_chuoi_palindrome;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println("nhap vao chuoi can kiem tra:");
        Scanner input=new Scanner(System.in);
        String string= input.nextLine();
        Queue queue=new LinkedList();
        for (int i=string.length()-1;i>=0;i--){
            queue.add(string.charAt(i));
        }
        String reverse="";
        while (!queue.isEmpty()){
            reverse=reverse+queue.remove();
        }
        if(string.equals(reverse)){
            System.out.println("chuoi nay là palidrome");
        }else {
            System.out.println("chuoi nay khong phai palidrome");
        }
    }
}
