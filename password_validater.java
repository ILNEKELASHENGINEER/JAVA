import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class RegexCurrencySymbol {
 
    public static void main(String args[]) {
        String password1 = "Neke2lash@"; // you can also scan a string as input
 
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
        boolean validPassword = isValidPassword(password1,regex);
        System.out.println("Neke2lash@ is valid password:" +validPassword);
 
        String password2 = "helloword#123";  // you can also scan a string as input
 
        String regex1 = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
        boolean validPassword1 = isValidPassword(password2,regex1);
        // No upper case
        System.out.println("helloword#123 is valid password:" +validPassword1);
    }
 
    public static boolean isValidPassword(String password,String regex)
    {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
Output
Neke2lash@ is valid password:true
helloword#123 is valid password:false
