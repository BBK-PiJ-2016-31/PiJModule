import java.util.*;

public class Hailstone{

	private static ArrayList<Integer> result = new ArrayList<>();

	public static ArrayList hail1(int n){
		result.add(n);
		if (n==1) return result;
		if (n%2==0){
			hail1(n/2);
		} else {
			hail1((3*n)+1);
		}
		return result;
	}
}