import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by D on 14/05/2017.
 */
public class PrimeDivisorListImpl {

    private List<Integer> list = new ArrayList<>();

    private Integer inputNum;

    private Map<Integer, Integer> map = new HashMap<>();

    public PrimeDivisorListImpl(Integer x) {
        inputNum = x;
    }



    @Override
    public String toString() {
        if (list.isEmpty()) return "The list is empty";
        return " ";
        // to be completed
   }

    private boolean isPrime(Integer n) {
        for (int i = 2; (i/2) < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
