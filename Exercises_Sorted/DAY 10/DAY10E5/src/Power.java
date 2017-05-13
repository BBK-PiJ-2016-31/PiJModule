/**
 * Created by D on 12/05/2017.
 */
public class Power {

    public static void main(String[] args) {
        Power f = new Power();
        System.out.println(f.launch(2,8));
    }

    public int launch(int base, int exponent) {
        if (exponent==1) return base;
        int result=0;
        result += base * launch(base,exponent-1);
        return result;
    }
}