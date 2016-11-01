public class Matrix{
	int[][] array;
	int row, column;
	public Matrix (int row, int column){
		this.row = row;			// to use at other places
		this.column = column; // to use them in other functions
		array = new int [row] [column];
		for (int i=0 ; i<row ; i++){
			for (int j=0 ; j<column ; j++){
				array [i][j] =1;
			}
		}
//		print();
	}

	public void setElement(int row, int column, int value){
		if ((row<=this.row) && (column<=this.column)) {
			array[row][column]=value;
//			print();
//		}else {
//			System.out.println ("** Position out of bounds **");
		}
	}

	public void setRow(int row, String value){
		int counter=0;
		if (row<=this.row){
			for (String val: value.split(",")){
				counter++;
			}
			if (counter==this.column){
				counter=0;
				for (String val: value.split(",")){
					array [row][counter] = Integer.parseInt(val);
					counter++;
				}
				print();
//			} else {
//				System.out.println (" More columns than expected ");
			}
		}
	}

	public void setColumn(int column, String value){
		int counter=0;
		if (column<=this.column){
			for (String val: value.split(",")){
				counter++;
			}
			if (counter==this.row){
				counter=0;
				for (String val: value.split(",")){
					array [counter][column] = Integer.parseInt(val);
					counter++;
				}
//				print();
//			} else {
//				System.out.println (" More columns than expected ");
			}
		}
	}

	public toString(){
		
	} 
	public void print(){
		for (int i=0 ; i<row ; i++){
			for (int j=0 ; j<column ; j++){
				System.out.print ("Array["+i+"]["+j+"]="+ array[i][j]+"  ");
			}
			System.out.println("");
		}
	}

}