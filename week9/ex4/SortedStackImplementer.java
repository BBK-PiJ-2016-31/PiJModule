public class SortedStackImplementer<T extends Number> extends StackImplementer<T>{

	@Override
	public void push (T object){
		StackNode<T> newObject = new StackNode<T>(object);
		if (head==null){
			head=newObject;
			return;
		}
		
		StackNode<T> position= head;
		StackNode<T> oneBeforeActual=null;
		
		int currentDifference=0;
		int lastDifference=1000;

		while (position!=null){
			if (object>position.getValue()){
// prblem line				currentDifference=object-lastDifference;
				if (position==head){lastDifference=currentDifference;}
				if (currentDifference<lastDifference){
					lastDifference=currentDifference;
					oneBeforeActual=position;
				}
			}
			position=position.getNextNode();
		}
		newObject.setNextNode(oneBeforeActual.getNextNode());
		oneBeforeActual.setNextNode(newObject);

//		newObject.setNextNode(head);
//		head=newObject;
	}
}