public class HospitalManager {

	private Patient firstPatient = null;
	private Patient current= null;
	private static int numberOfPatients=0;
	
	public void addPatient(Patient newPatient) {	// if first patient then record it
		numberOfPatients++;
		if (firstPatient == null) {
			firstPatient = newPatient;
			return;
		}
		
		current = this.firstPatient;			// if not then find the last patient
		while (current.getNextPatient() != null) {
			current = current.getNextPatient();
		}
		current.setNextPatient(newPatient);		// add it to that patient
//		System.out.println ("C.Next: "+current.getNextPatient().getName());
		newPatient.setPreviousPatient(current);
//		System.out.println ("N.Previous: "+newPatient.getPreviousPatient().getName());
	}
	
	public boolean deletePatient(String name) {
		boolean done = false;
		if (firstPatient == null) {				// if nothing exixts
			System.out.println("No Records to Delete");
		}
		
		if (firstPatient.getName().equals(name)) {		// if first patient needs deleting
			if (firstPatient.getNextPatient() == null) {	// if there is no other patient
				firstPatient = null;
			} else {									// else remove pointer from first patient
				firstPatient = firstPatient.getNextPatient();	// assign it to next patient
				firstPatient.setPreviousPatient(null); // make previous patient null
				System.out.println("FP: "+firstPatient.getName());
			}
			numberOfPatients--;		// reduce count as patient is deleted sucessfully
			return true;
		}
		
		current = firstPatient;		// else load the first Patient 
		while (current.getNextPatient() != null) {	// if there is a next patient
			if (current.getNextPatient().getName().equals(name)){
				if (current.getNextPatient().getNextPatient()!=null){
					current.getNextPatient().getNextPatient().setPreviousPatient(current);
					current.setNextPatient(current.getNextPatient().getNextPatient());	// realign pointer to the next one
				} else {
					current.getNextPatient().setPreviousPatient(null);
					current.setNextPatient(null);
				}
				numberOfPatients--;
				return true;
			}
			current = current.getNextPatient();
		}

		return done;
	}
	
	public int getNumberOfPatients(){
		return numberOfPatients;
	}

	public void printRecords(){
		if (firstPatient == null) {
			System.out.println("No Records to Print!");
			return;
		}
		
		current = firstPatient;		// start from the first patient
		while (current.getNextPatient() != null) {		// when next element is there 
			System.out.println ("Name: "+current.getName()+"\t Age: "+current.getAge()+"\t Illness: "
			+current.getIllness());
			current = current.getNextPatient();		// keep printing and keep moving on
		}
		System.out.println ("Name: "+current.getName()+"\t Age: "+current.getAge()+"\t Illness: "
			+current.getIllness()+"\n");	// print the last record as the next one WILL BE null
	// now print in reverse
		while (current.getPreviousPatient() != null) {		// when next element is there 
			System.out.println ("Name: "+current.getName()+"\t Age: "+current.getAge()+"\t Illness: "
			+current.getIllness());
			current = current.getPreviousPatient();		// keep printing and keep moving on
		}
		System.out.println ("Name: "+current.getName()+"\t Age: "+current.getAge()+"\t Illness: "
			+current.getIllness()+"\n");	// print the last record as the next one WILL BE null
	}
}
