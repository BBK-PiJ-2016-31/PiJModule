/**
 * Created by D on 12/05/2017.
 */
public class CodeCorrect {

    public static void main(String[] args) {
        CodeCorrect launch = new CodeCorrect();
        System.out.println(launch.buggyMethod(30));
    }

    public String buggyMethod(int n){
        if (n<=0){
            return "";
        }
        return n+ " "+buggyMethod(n-2);
    }
}
