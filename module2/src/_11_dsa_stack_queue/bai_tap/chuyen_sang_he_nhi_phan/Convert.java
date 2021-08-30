package _11_dsa_stack_queue.bai_tap.chuyen_sang_he_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void DecimalToBinary(int number){
        Stack<Integer> myStack=new Stack<>();
        while (number!=0){
            int number1=number%2;
            myStack.push(number1);
            number/=2;
        }
        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Convert myConvert = new Convert();
        System.out.print("Hãy nhập vào 1 số: ");
        int inputNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Hệ nhị phân của " + inputNumber + " là: ");
        myConvert.DecimalToBinary(inputNumber);

    }
}
