public class Employee{
	int[] id;
	String[] name;
	int length;
	int counter=0;

	public Employee(int initialLength){
		length = initialLength;
		id = new int[initialLength];
		name = new String [initialLength];
	}

	public boolean addRecord(int id, String name){
		if (id==0 || name.length()==0) {
			if (this.id[0]!=0){
				printRecords();
			} else {
				System.out.println ("No records to print!");
			}
			return false;
		}
		this.id[counter]=id;
		this.name[counter]=name;
		counter++;
		if (counter==length){
			resetWithNew();
		}
		return true;
	}

	public void resetWithNew(){		// to create a double size array
		int[] tempId = new int[length*2];
		String[] tempName = new String[length*2];
		for (int i=0; i<length ; i++){
			tempId[i] = id[i];
			tempName[i] = name[i];
		}
		id = null;
		name = null;		// discard the exisitn arrays
		id = tempId;		// assign them to the new sized arrays
		name = tempName;
		length *= 2;
	}

	public void printRecords(){
		for (int i=0; i<length; i++){
			if (id[i]%2==0 || name[i].charAt(0)=='S'){
				if (name[i]!=null){System.out.println ("ID: "+ id[i] +"Name: "+name[i]);}
			}
		}
	}
}