public class Person {
	private int id=0;
	private Person nextPerson=null;

	public Person(int id){
		this.id=id;
	}

	public Person getNextPerson(){
		return nextPerson;
	}

	public void setNextPerson(Person person){
		nextPerson=person;
	}
}
