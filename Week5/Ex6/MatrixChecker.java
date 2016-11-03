public class MatrixChecker{

	public boolean isSymmetrical(int[] arrayOfMatrix){
		boolean isOrNot = true;	// assume it is symmetrical
		for (int i=0; i<arrayOfMatrix.length/2; i++){
			if (arrayOfMatrix[i]!=arrayOfMatrix[arrayOfMatrix.length-i-0]){
				isOrNot = false;
			}
		}
		return isOrNot;
	}

}