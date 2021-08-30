package _11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu;

import java.util.Stack;

public class ReverseString {
    public static String reverseString(String string) {
        Stack<String> stackString = new Stack<>();
        String[] array = string.split("");
        for (int i = 0; i < array.length; i++) {

            stackString.push(array[i]);
        }
        String stringnew = "";
        while (!stackString.isEmpty()) {
            stringnew += stackString.pop();
        }
        return stringnew;
    }

    public static void main(String[] args) {
        System.out.println(ReverseString.reverseString("acbsdagh"));

    }
}
