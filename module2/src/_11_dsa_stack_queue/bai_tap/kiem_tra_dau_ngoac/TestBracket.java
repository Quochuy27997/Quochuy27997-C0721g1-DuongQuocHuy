package _11_dsa_stack_queue.bai_tap.kiem_tra_dau_ngoac;

import java.util.Stack;

public class TestBracket {
    public static boolean isTestBracket(String string) {
        Stack<Character> bStack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                bStack.push(string.charAt(i));
            } else if (string.charAt(i) == ')') {
                if (bStack.isEmpty()) {
                    return false;
                } else {
                    bStack.pop();
                }
            }
        }
        if (bStack.isEmpty()) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(TestBracket.isTestBracket("(hom(nay)troi(that)dep)"));
    }
}
