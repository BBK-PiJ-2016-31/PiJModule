public class Matrix{
	int[][] array;
	public Matrix (int row, int column){
		array = new int [row] [column];
		for (int i=0 ; i<row ; i++){
			for (int j=0 ; j<column ; j++){
				array [i][j] =1;
				System.out.print ("Array["+i+"] ["+j+"] = "+ array[i][j]);
			}
			System.out.println("");
		}

	}

}