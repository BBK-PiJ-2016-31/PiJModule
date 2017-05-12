public class Node {
	private int value;
	private Node previousNode=null;

	public Node(int value){
		this.value=value;
	}

	public int getValue(){
		return value;
	}

	public Node getPreviousNode(){
		return previousNode;
	}

	public void setPreviousNode(Node n){
		previousNode=n;
	}
}

