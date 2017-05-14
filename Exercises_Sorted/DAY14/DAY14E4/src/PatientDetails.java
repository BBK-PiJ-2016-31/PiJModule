import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PatientDetails{
	
	private List<Patient> details = new ArrayList<Patient>();

	public static void main (String[] args){
		PatientDetails test = new PatientDetails();
		test.launch();
	}

	public void launch(){
		while (true){
			registerNew();
		}
	}

	public void registerNew(){
		Patient newEntry= new Patient();
		try {
			newEntry.name = getName();
			newEntry.age = getAge(newEntry.name);
		}catch (IOException e){
			e.printStackTrace();
		}
		details.add(newEntry);
	}

	public String getName() throws IOException {
		System.out.print("Enter name of the new patient: ");
		return (new BufferedReader(new InputStreamReader(System.in)).readLine());
	}

	public int getAge(String name) throws IllegalArgumentException, IOException {
		System.out.print("Enter "+ name +"'s age: ");
		String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
		int temp=0;
		try{
			temp = Integer.parseInt(str);			
		} catch (NumberFormatException e) {
			System.out.println("What! NO no no no no no no no");
		}
		if (temp<0 || temp>130){
			throw new IllegalArgumentException("Age not in range");
		}
		return temp;		
	}
}