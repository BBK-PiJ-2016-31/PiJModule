public class StackNode<T>{

	private T value;
	private StackNode<T> nextNode=null;

	public StackNode(T value){
		this.value=value;
	}

	public T getValue(){
		return value;
	}

	public StackNode<T> getNextNode(){
		return nextNode;
	}

	public void setNextNode(StackNode<T> object){
		nextNode=object;
	}

}