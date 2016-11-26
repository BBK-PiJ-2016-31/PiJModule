public class Node {		// no methods so keep everything public
	private int value;
	private Node nextNode=null;

	public Node(int value){
		this.value=value;
	}

	public int getValue(){
		return value;
	}

	public Node getNextNode(){
		return nextNode;
	}

	public void setNextNode(Node n){
		nextNode=n;
	}
}
