import java.util.*;

public class Hailstone{

	private static ArrayList<Integer> result = new ArrayList<>();

	public static ArrayList hail1(int n){
		if (n==1) return result;
		if (n%2==0){
			result.add(n);
			hail1(n/2);
		} else {
			result.add(n);
			hail1((3*n)+1);
		}
		return result;
	}
}