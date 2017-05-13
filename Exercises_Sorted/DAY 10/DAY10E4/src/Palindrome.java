/**
 * Created by D on 12/05/2017.
 */
public class Palindrome {
    boolean result = false;
    public static void main(String[] args) {
        Palindrome f = new Palindrome();
        System.out.println(f.launch("HHeleHH"));
    }

    public boolean launch(String str) {
        if (str.length()<=1) return true;
        char a = str.charAt(0);
        if (a == str.charAt(str.length()-1)){
            result = true;
            launch(str.substring(1, str.length()-1));

        } else {
            result= false;
            return false;
        }

        return result;

    }
}