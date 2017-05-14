public class Target{
	int[][][] array;
	int dimension, x, y, z;
	public Target (int size){
		dimension=size;
		array = new int[size][size][size];
		init ();
	}

	public void init(){
		for (int i=0;i<dimension;i++){
			for (int j=0;j<dimension;j++){
				for (int k=0;k<dimension;k++){
					array[i][j][k]=0;
				}
			}
		}	// 3D array with all zero are ready.
		x = randomGenerator(dimension);
		y = randomGenerator(dimension);
		z = randomGenerator(dimension);
		array[x][y][z]=1;
		System.out.println("x: " + x + " y: " + y + " z: " + z);
	}

	public Result fire (int x, int y, int z){
		if ((x>=dimension) || (y>=dimension) || (z>=dimension) || (x<0) || (y<0) || (z<0)) { // checking for x,y,z dimention value
			return (Result.OUT_OF_RANGE);
		}else if (array[x][y][z]==1){
			return (Result.HIT);
		}
		if (x>this.x) {return (Result.FAIL_LEFT);}
		if (x<this.x) {return (Result.FAIL_RIGHT);}

		if (y>this.y) {return (Result.FAIL_LOW);}
		if (y<this.y) {return (Result.FAIL_HIGH);}

		if (z>this.z) {return (Result.FAIL_SHORT);}
		if (z<this.z) {return (Result.FAIL_LONG);}

		return Result.CODE_PROBLEM;
	}

	public int randomGenerator(int limit){
		return ((int) Math.abs(limit * Math.random())); // random number generator
	}
}