import java.time.Instant;
import java.time.Duration;

public class Main{
	public static void main (String[] args){
		Instant start = Instant.now();
		System.out.println (Hailstone.hail1(200000));
		Instant end = Instant.now();
		Duration timeTaken = Duration.between(end,start);
		System.out.println ("Time taken: "+ timeTaken.toMillis());
	}
}