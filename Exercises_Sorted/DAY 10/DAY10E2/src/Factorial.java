/**
 * Created by D on 12/05/2017.
 */
public class Factorial {
    int result = 0;
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.launch(4));
    }

    public int launch(int n) {
        if (n == 1) {
            return 1;
        }

        result = launch(n - 1) * n;
        return result;
    }
}