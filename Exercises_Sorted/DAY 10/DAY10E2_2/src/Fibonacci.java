/**
 * Created by D on 12/05/2017.
 */
public class Fibonacci {
    int result = 0;
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.launch(6));
    }

    public int launch(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return launch(n - 1) + launch(n - 2);
        }
    }
}
