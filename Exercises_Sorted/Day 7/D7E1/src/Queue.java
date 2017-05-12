public class Queue {
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
			currentNode.setPreviousNode(newNode);
			currentNode=newNode;
		}		
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
