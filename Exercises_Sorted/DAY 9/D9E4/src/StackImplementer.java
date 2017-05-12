public class StackImplementer<T> implements Stack<T>{
	public StackNode<T> head=null;

	public T pop(){
		if (head==null){
			return null;
		}
		T result = head.getValue();
		System.out.println("Popped: "+result);
		head=head.getNextNode();
		return result;
	}

	public void push (T object){
		StackNode<T> newObject = new StackNode<T>(object);
		if (head==null){
			head=newObject;
			return;
		}
		newObject.setNextNode(head);
		head=newObject;
	}

	public boolean isEmpty(){
		return (head==null);
	}
}