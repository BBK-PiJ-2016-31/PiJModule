public class MatrixChecker{
	boolean symmetrical2 = false;

	public boolean isSymmetrical(int[] arrayOfMatrix){
		boolean isOrNot = true;	// assume it is symmetrical
		for (int i=0; i<arrayOfMatrix.length; i++){
			if (arrayOfMatrix[i]!=arrayOfMatrix[arrayOfMatrix.length-i-1]){
				isOrNot = false;
			}
		}
		return isOrNot;
	}

	public boolean isSymmetrical(int[][] arrayOfMatrix){
		symmetrical2 = true;
		return (isTriangular(arrayOfMatrix));
	}

	public boolean isTriangular(int[][] arrayOfMatrix){
		int rowLength = arrayOfMatrix.length;			// row length
		int columnLength = arrayOfMatrix[0].length; // column length. All column lengths will be the same
		boolean isOrNot = true;	// assume result is correct
		for (int i=0; i<rowLength; i++){
			for (int j=0;j<columnLength;j++){
				if (symmetrical2==true){
					if (arrayOfMatrix[i][j]!=arrayOfMatrix[j][i]){
						isOrNot = false;
					}
				}else {
					if (i>j){
				 		if (arrayOfMatrix[i][j]!=0){
				 			isOrNot = false;
					 	}
					}
				}			
			}
		}
		symmetrical2 = false;
		return isOrNot;
	}
}