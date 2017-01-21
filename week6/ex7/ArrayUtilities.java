public class ArrayUtilities {

	public static ArrayUtilities convertList (int[] value){
	Node firstNode=null;
	Node lastNode=null;
		if (value==null){	// if null is provided
			System.out.println ("Null Array not allowed!");
			return null;
		}		
		for (int i : value){
			Node newNode = new Node(i);
			newNode.setNextNode(value[i+1]);
			if (firstNode==null) {
				firstNode=newNode;
				lastNode=newNode;
			}
			if (newNode.getNextNode()==null){
				lastNode=newNode;
				System.out.println("Pushing Last Node"+i+"...");
			} else{
				System.out.println("Pushing "+i+"...");
			}
		}
		return this;
	}
}