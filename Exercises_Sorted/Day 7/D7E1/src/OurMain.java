public class OurMain {

	public static void main(String[] args) {
		Queue i = new Queue();

		System.out.println("There are "+i.size()+" requests in the queue.");
		
		i.insert (1);
		i.insert (2);
		i.insert (3);
		i.insert (4);
		i.retrieve();
		i.retrieve();
		i.insert (5);
		i.insert (6);
		i.insert (7);
		i.insert (8);
		i.insert (9);
		i.insert (10);
		
		System.out.println("There are "+i.size()+" requests in the queue.");

		i.retrieve();
		i.retrieve();
		i.retrieve();
		i.insert(11);
		i.retrieve();
		i.retrieve();
		i.retrieve();
		i.retrieve();
		i.retrieve();
		i.insert(12);
		i.retrieve();
		i.retrieve();
		i.retrieve();
		
	}
	
}