package JUnitTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertFalse;
import java.util.Arrays;
import java.util.regex.Pattern;


@RunWith(Parameterized.class)
public class CredentialTest {
    private final String regex;
    private final String actualString;
    private final boolean answer;
    private Credential credential;

    public CredentialTest(String regex,String actualString,boolean passOrFail){
        this.regex=regex;
        this.actualString=actualString;
        this.answer=passOrFail;
    }
    @Before
    public void initialize(){
        credential = new Credential();
    }
    @Parameterized.Parameters
    public  static Collection<Object[]> input(){
        return Arrays.asList(new Object[][]{    {"^[a-zA-Z]*$","AlanSamuel",true},
                                                {"^(?=.*[a-z])(?=.*[.+_-])(?=.*[0-9])[a-z0-9@_.+-]*$","alansam23@gmail.com",true},
                                                {"^[a-zA-Z]+ [a-zA-Z]+$","AlanSamuel",false},
                                                {"^(?=.*[a-z])(?=.*[A-Z])(?=.*[ ])(?=.*[0-9])(?=.*[@$!%*?&])[ A-Za-z0-9@$!%*?&]{8,}$","la n2S@amuel",true},
                                                {"^[+](91) [0-9]*$","+91 9677188879",true}});
    }
    @Test
    public  void shouldPassAllRegexTest(){
        System.out.println("The Regex is: "+ Pattern.matches(regex,actualString));
       // assertFalse(String.valueOf(answer),credential.credential(regex,actualString,answer));
        assertEquals(answer,credential.credential(regex,actualString,answer));
    }
}
