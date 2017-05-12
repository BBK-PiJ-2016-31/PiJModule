public class OurMain {

	public static void main(String[] args) {
		Supermarket market = new Supermarket();

		System.out.println("There are "+market.size()+" people in the queue.");

		Person one = new Person(1);
		Person two = new Person(2);
		Person three = new Person(3);
		Person four = new Person(4);
		Person five = new Person(5);
		Person six = new Person(6);
		Person seven = new Person(7);
		Person eight = new Person(8);

		market.insert (one);
		market.insert (two);
		market.insert (three);
		market.insert (four);
		market.insert (five);
		market.insert (six);
		market.insert (seven);
        market.insert (eight);

        System.out.println("There are "+market.size()+" people in the queue.");

		market.retrieve();
		market.retrieve();
		System.out.println("There are "+market.size()+" people in the queue.");

	}
	
}