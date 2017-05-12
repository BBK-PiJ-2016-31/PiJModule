public class OurMain {

	public static void main(String[] args) {
		OurMain newObject = new OurMain();
		newObject.launch();
	}

	public void launch(){
		SimpleMap map = new MapImplementer();
		map.put(1,"A");
		map.put(2,"B");
		map.put(3,"C");
		map.put(4,"D");
		map.put(5,"E");

		System.out.println("Key 3 sent - Received "+map.get(3));
		System.out.println("Key 5 sent - Received "+map.get(5));
		System.out.println("Key 1 sent - Received "+map.get(1));

		System.out.println("Removed 3 ");
		map.remove(3);
		System.out.println("Key 3 sent - Received "+map.get(3));

		System.out.println("is Empty - Received "+map.isEmpty());

		System.out.println("Removed All elements ");
		map.remove(1);
		map.remove(2);
		map.remove(3);
		map.remove(4);
		map.remove(5);
		System.out.println("is Empty - Received "+map.isEmpty());

	}
}