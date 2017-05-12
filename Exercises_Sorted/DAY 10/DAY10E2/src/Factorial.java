/**
 * Created by D on 12/05/2017.
 */
public class Factorial {
    int result=0;
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.launch(5));
    }

    public Integer launch(int n) {
        if (n > 0) {
            System.out.println(n);
            result += launch(n - 1);
        }
        return result;
    }
}