package _19_string_regex.thuc_hanh.validate_acount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACOUNT_REGEX="^[_a-z0-9]{6,}$";
    public AccountExample(){}
    public boolean validate(String regex){
        Pattern pattern=Pattern.compile(ACOUNT_REGEX);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}
