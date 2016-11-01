public class ArrayCopier{
	public ArrayCopier(){
	}

	public int[] copy(int[] source, int[] destination){
		int sLength = source.length;
		int dLength = destination.length;
		if (dLength>sLength){
			for (int i=0; i<destination.length;i++){
				if (i<sLength){
					destination[i]=source[i];
				} else {
					destination[i]=0;
				}

			}
		} else if (dLength == sLength){
			for (int i=0; i<destination.length;i++){
				destination[i]=source[i];
			}

		} else {
			for (int i=0; i<destination.length;i++){
				destination[i]=source[i];
			}
		}
		return destination;
	}

}