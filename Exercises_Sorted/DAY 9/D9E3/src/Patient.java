public class Patient {
	
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;		// Patient details
	private Patient previousPatient;
	public Patient(String name, int age, String illness) { // initialisation
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null; // Pointer to another patient!
		this.previousPatient = null;
	}
	
	public Patient getNextPatient() {
		return nextPatient;
	}

	public Patient getPreviousPatient() {
		return previousPatient;
	}

	public void setNextPatient(Patient newPatient) {
		nextPatient = newPatient;
	}

	public void setPreviousPatient(Patient newPatient) {
		previousPatient = newPatient;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getIllness(){
		return illness;
	}
}
