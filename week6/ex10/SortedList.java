public class SortedList {

	private Node firstNode=null;
	private Node currentNode=null;
	private int queueSize=0;

	public void insert(int value){
		Node newNode = new Node(value);
		System.out.println("Inserting request: "+value+" ...");
		queueSize++;
		if (firstNode==null){
			firstNode=newNode;
			currentNode=newNode;
		} else{
			Node bigOne = getHigherNode(value);
//			if (bigOne!=null){
//				System.out.println("Returned: "+bigOne.getValue());
//			} else{
//				System.out.println("Returned: null");
//			}
			if (bigOne==null){
				newNode.setPreviousNode(firstNode);
				firstNode=newNode;
			} else if (bigOne==currentNode){
				currentNode.setPreviousNode(newNode);
				currentNode=newNode;
			} else{
				newNode.setPreviousNode(bigOne.getPreviousNode());
				bigOne.setPreviousNode(newNode);
//			currentNode.setPreviousNode(newNode);
//			currentNode=newNode;				
			}
		}		
	}

	public Node getHigherNode(int value){
		Node temp=firstNode;
		Node sendNode=null;
		int currentDifference=0;
		int smallestDifference=100;
		boolean contnue=true;
		while (contnue){	// A return statement will take care of not gettign stuck
			if (temp.getValue()>value) {
				currentDifference=temp.getValue()-value;
				if (currentDifference<1){
					return temp;
				} else {
					if (currentDifference<=smallestDifference){
						smallestDifference=currentDifference;
						sendNode=temp;
					}
				}
			}
			if (temp.getPreviousNode()!=null){
				temp=temp.getPreviousNode();
			} else {
				return sendNode;
			}			
		}
		return sendNode;
	}

	public void printList(){
		Node temp=firstNode;
		if (temp==null){ System.out.println("Nohting to print!"); return;}
		while (true){
			System.out.print(temp.getValue()+"\t");
			if (temp.getPreviousNode()==null){
				break;
			} else{
				temp=temp.getPreviousNode();
			}
		} System.out.println("");
	}

	public Integer retrieve(){
		if (firstNode !=null) {
			int i = firstNode.getValue();
			System.out.println("Retreiving request: "+i+" ... done.");
			queueSize--;
			if (firstNode!=currentNode){
				firstNode=firstNode.getPreviousNode();			
			} else{
				firstNode=null;
				currentNode=null;
			}
			return i;
		} else {
			System.out.println("Nothing to retrieve!");
		}
		return null;
	}

	public int size(){
		return queueSize;
	}
}
