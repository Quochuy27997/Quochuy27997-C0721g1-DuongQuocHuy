package _11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu;

import java.util.Arrays;
import java.util.Stack;

public class ReverseNumber {
    public static int[] reverseNumber(int[] ints) {
        Stack<Integer> stackInt = new Stack<>();
        for (int i = 0; i < ints.length; i++) {
            stackInt.push(ints[i]);
        }
        for (int i = 0; i < ints.length; i++) {
            ints[i] = stackInt.pop();
        }
        return ints;
    }

    public static void main(String[] args) {
        int[] ints = ReverseNumber.reverseNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(Arrays.toString(ints));
    }
}
