public class OurMain {

	public static void main(String[] args) {
		OurMain newObject = new OurMain();
		newObject.launch();
	}

	public void launch(){
		String str="my test ";
		System.out.println(str.hashCode());
		int result = HashUtilities.shortHash(str.hashCode());
		System.out.println(result);
		
	}
}