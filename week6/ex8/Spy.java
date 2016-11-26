public class Spy {		// no methods so keep everything public
	private static int spyCount=0;
	private int spyID;

	public Spy(int id){
		spyID=id;
		spyCount++;
		System.out.println("Spy ID: "+spyID);
		System.out.println("Total number of spies: "+spyCount);
	}

	public void die(){
		spyCount--;
		System.out.println("Spy "+spyID+" has been detected and eliminated");	
		System.out.println("Number of spies left: "+spyCount);
	}
}
