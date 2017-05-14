import java.io.File;

public class Ex2 {

	public static void main(String[] args) {	// ARGUMENTS ARE SET IN ECLIPSE SETTINGS.
		// TODO Auto-generated method stub
		Ex2 ex = new Ex2();
		ex.launch(args);
	}
	public void launch(String[] args){
		for (String str:args){
			File file = new File ("/Users/D/Desktop/"+str);
			file.mkdir();
		}
	}

}
