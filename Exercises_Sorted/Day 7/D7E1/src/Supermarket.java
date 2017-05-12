public class Supermarket implements PersonQueue {

	private Person firstPerson=null;
	private Person lastPerson=null;
	private int queueSize=0;

	@Override
	public void insert(Person person){
		queueSize++;
		if (firstPerson==null){
			firstPerson = person;
			lastPerson=person;
		}
		lastPerson.setNextPerson(person);
		lastPerson=person;
	}

	@Override
    public Person retrieve(){
		if (firstPerson==null) return null;
		queueSize--;
		Person returnedPerson = firstPerson;
		firstPerson=firstPerson.getNextPerson();
		return returnedPerson;
	}

    public void addPerson (Person p){
        insert(p);
    }

    public void servePerson (){
        retrieve();
    }

	public int size(){
		return queueSize;
	}
}
