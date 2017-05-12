import java.util.ArrayList;
import java.util.List;

public class ArrayUtilities {

	public static List<Integer> toArraySort (int[] value){
		if (value==null){	// if null is provided
			System.out.println ("Null Array not allowed!");
			return null;
		}
		List<Integer> returnList = new ArrayList<>();
		for (int i : value){
			returnList.add(i);
		}
		return returnList;
	}
}