import java.io.File;


public class Ex1 {

	public static void main(String[] args) {
		Ex1 ex = new Ex1();
		ex.launch();

	}
	public void launch(){
			File file = new File ("/Users/D/Desktop");
			String list[] = file.list();
			int counter=1;
			for (String str: list){
				System.out.println (counter+") "+str);
				counter++;
			}
		}
		
	}
