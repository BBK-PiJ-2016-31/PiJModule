import java.io.File;

public class Ex3 {

	public static void main(String[] args) {	// ARGUMENTS ARE SET IN ECLIPSE SETTINGS.
		// TODO Auto-generated method stub
		Ex3 ex = new Ex3();
		ex.launch(args);
	}
	public void launch(String[] args){
//		for (String str:args){
			File file = new File ("/Users/D/Desktop");
			String[] str = file.list();
			for (String i:str){
				System.out.println(""+i);
			}
//		}
	}

}
