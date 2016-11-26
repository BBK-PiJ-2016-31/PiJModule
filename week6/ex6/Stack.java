public class Stack {
	private Node firstNode=null;
	private Node currentNode=null;
	private int queueSize=0;

	public void push(int value){
		Node newNode = new Node(value);
		System.out.println("Pushing "+value+"...");
		queueSize++;
		if (firstNode==null){
			firstNode=newNode;
			currentNode=newNode;
		} else{
			newNode.setNextNode(currentNode);
			currentNode=newNode;
		}
	}

	public Integer pop(){
		if (currentNode !=null) {
			int i = currentNode.getValue();
			System.out.println("Popping... it's a "+i);
			queueSize--;
			if (firstNode!=currentNode){
				currentNode=currentNode.getNextNode();			
			} else{
				firstNode=null;
				currentNode=null;
			}
			return i;
		} else {
			System.out.println("Stack is empty!");
		}
		return null;
	}

	public boolean empty(){
		return ((queueSize==0));
	}
}
