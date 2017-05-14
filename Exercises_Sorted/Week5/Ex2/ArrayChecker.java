public class ArrayChecker{
	public ArrayChecker(){

	}

	public boolean isSymetrical (int[] array){
		boolean symetrical = true;
		for (int i=0 ; i<array.length/2 ; i++){
			if (array[i]!= array[array.length-i-1] ) {
				symetrical=false;
			}
		}
		return symetrical;
	}

	public int[] reverse(int[] check){
		int[] reverseArray = check;
		for (int i=0; i<check.length; i++){
			reverseArray[i]=check[check.length-i-1];
		}
		return reverseArray;
	} 
}