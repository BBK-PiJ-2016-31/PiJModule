import java.util.List;

public class OurMain {

	public static void main(String[] args) {
		int [] i = new int[5];
		i[0]=1;
		i[1]=2;
		i[2]=3;
		i[3]=4;
		i[4]=5;
		List<Integer> returned = ArrayUtilities.toArraySort(i);
		for (int j: returned){
			System.out.println(""+j);
		}

	}
	
}