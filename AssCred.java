import java.util.regex.Pattern;
public class  a AssCred {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("");
        boolean phNo = Pattern.matches("^[+](91) [0-9]*$","+91 9677188879");
//        boolean name1 = Pattern.matches("^[a-zA-Z]+ [a-zA-Z]+$","Alan Samuel");
        boolean name = Pattern.matches("^(?=.*[A-Z])(?=.*\\s)(?=.*[a-z])[a-zA-z\\s]{9,}$","Alan Samuel");
//        boolean ttd = Pattern.matches("^(?=.*[a-z])(?=.*[.+_-])(?=.*\\d)[a-z\\d@_.+-]*$","alansam0023@gmail.com");
        boolean email = Pattern.matches("^[a-zA-Z0-9]{2,}[-._+]?[a-zA-Z0-9]*[^._+-]@[a-z0-9]+[.][a-z]{3,6}[.]?[a-z]*$","abc.100@abc.com.au");
        boolean password = Pattern.matches("^(?=.*[a-z])(?=.*\\s)(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\s\\d@$!%*?&]{8,}$","lan2@ Samuel");
        System.out.println("Phone Number is \t"+phNo +" \n"+"Name is \t\t\t" +name+"\n"+"E-Mail is \t\t\t"+email+"\n"+"Password of User is "+password);
//        System.out.println(ttd+" "+password);

    }
}


