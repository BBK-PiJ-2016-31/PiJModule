public class OurMain {

	public static void main(String[] args) {
		Spy a=new Spy(1);
		Spy b=new Spy(2);
		Spy c=new Spy(3);
		Spy d=new Spy(4);
			d.die();
		Spy e=new Spy(5);
		Spy f=new Spy(6);
		Spy g=new Spy(7);
		Spy h=new Spy(8);
			h.die();
		Spy i=new Spy(9);
		Spy j=new Spy(10);

		a.die();
		g.die();

	}
	
}