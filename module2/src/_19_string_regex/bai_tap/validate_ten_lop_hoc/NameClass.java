package _19_string_regex.bai_tap.validate_ten_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String NameClass_Regex="^[CAP][0-9]{4}[GHIKLM]$";
    public NameClass(){}
    public boolean validate (String string){
        pattern=Pattern.compile(NameClass_Regex);
        matcher=pattern.matcher(string);
        return matcher.matches();
    }
}
