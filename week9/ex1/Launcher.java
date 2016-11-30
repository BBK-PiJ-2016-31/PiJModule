public class Launcher{
	
	public static void main (String[] args){
		Launcher l = new Launcher();
		l.launch();
	}

	public void launch(){
		Comparator<Integer> a = new Comparator<Integer>();
		Comparator<Double> b = new Comparator<Double>();
		Comparator<String> c = new Comparator<String>();
		System.out.println (b.getMax(2.4,1.4));
		System.out.println (a.getMax(16,1));
		System.out.println (c.getMax("12","1"));
	}

}