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
		newEntry.name = getName();
		newEntry.age = getAge(newEntry.name);
		details.add(newEntry);
	}

	public String getName(){
		System.out.print("Enter name of the new patient: ");
		return (System.console().readLine());		
	}

	public int getAge(String name) throws IllegalArgumentException{
		System.out.print("Enter "+ name +"'s age: ");
		String str = System.console().readLine();
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