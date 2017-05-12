public class MobilePhone extends OldPhone{

	private String[] lastNumbers=new String[10];
	private int counter=0;

	public MobilePhone(String brandName){
		super(brandName);
	}

	public void callNumber(String number){
		super.call(number);
		if (counter==10){
			counter=0; // one way of doing it start from top (faster + easier)
		}
		lastNumbers[counter]=number;
		counter++;

	}
	public void ringAlarm(String sound){
		System.out.println("Ringing alarm");
	}

	private void playGame(String name){
		System.out.println("Playing Game");
	}

	public void printLastNumbers (){
		for (int i=0; i<10;i++){
			System.out.print(" "+lastNumbers[i]);
		}
		System.out.println("");
	}
}