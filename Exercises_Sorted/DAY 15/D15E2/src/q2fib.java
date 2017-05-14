import java.util.*;

public class q2fib{

	private static Map <Long,Long> result = new HashMap<>();

	public static long fib(long n){
		if (n<=2) return 1;
		long result = fib(n-1) + fib (n-2);
		return result;
	}

	public static long fib1(long n){
		if (n<=2) return 1;
		if (result.containsKey(n)){
			return result.get(n);
		}
		long result1 = fib1(n-1) + fib1(n-2);
		result.put(n,result1);
		return result1;
	}
}