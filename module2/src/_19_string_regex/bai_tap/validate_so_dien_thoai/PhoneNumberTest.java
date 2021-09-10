package _19_string_regex.bai_tap.validate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberTest {
    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        String[] phoneNumber1 = new String[]{"(84)-(0935328993)", "(84)-(0935328983)"};
        String[] phoneNumber2 = new String[]{"(84)-(1935328993)", "(a5)-(0935328983)"};
        for (String s : phoneNumber1) {
            boolean isValid = phoneNumber.validate(s);
            System.out.println("Phone number is " + s + " is valid: " + isValid);
        }
        for (int i = 0; i < phoneNumber2.length; i++) {
            boolean isValid = phoneNumber.validate(phoneNumber2[i]);
            System.out.println("Phone number is " + phoneNumber2[i] + " is valid: " + isValid);
        }
    }

}

