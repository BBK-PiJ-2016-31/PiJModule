public class OurMain {

	public static void main (String[] args){
		SortedList list = new SortedList();

		list.insert(10);
		list.insert(26);
		list.insert(2);
		list.insert(20);
		list.insert(10);
		list.insert(61);
		list.insert(23);
		list.insert(20);
			list.printList();
//			list.retrieve();
		list.insert(300);
		list.insert(1);
			list.printList();		
		list.retrieve();
//		list.retrieve();
//		list.retrieve();
		list.retrieve();
		list.retrieve();
			list.printList();
		
	}
}
