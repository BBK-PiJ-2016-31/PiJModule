public class Launcher{

	public static void main (String[] args){
		Launcher l= new Launcher();
		l.launch();
	}

	public void launch(){
		Lecturer l = new Lecturer("Gimmy");
		l.doResearch("Plants");
		System.out.println (l.getName());
		l.teach("Maths");
	}
}