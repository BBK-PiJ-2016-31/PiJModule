public class Node<T>{

	private T value;
	private Node<T> nextNode=null;
	private Node<T> previousNode=null;

	public Node(T value){
		this.value=value;
	}

	public void setNextNode(Node<T> object){
		nextNode=object;
	}
	public Node<T> getNextNode(){
		return nextNode;
	}
	public void setPreviousNode(Node<T> object){
		previousNode=object;
	}
	public Node<T> getPreviousNode(){
		return previousNode;
	}
}
