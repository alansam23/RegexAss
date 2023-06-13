package JUnitTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Credential {
    public boolean credential(String regex, String actualString,boolean answer){
        boolean b = Pattern.matches(regex,actualString);
        return b;
//    public static void main(String[] args) {
//
//
//        String regex; //= "^(?=.*\\s)(?=.*[A-Z])[A-Za-z\\s]*$";
//        String actualString;// = "Alan Samuel";

//        Pattern p = Pattern.compile(regex);
//        Matcher m = p.matcher(actualString);
//        boolean b = m.matches();
//        System.out.println("Boolean is: "+b);

    }
}