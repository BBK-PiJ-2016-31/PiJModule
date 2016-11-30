public class PhoneLauncher{
	public static void main (String[] args){
		PhoneLauncher launcher=new PhoneLauncher();
		launcher.launch();
	}
	public void launch(){
		Phone sPhone = new SmartPhone("Nokia"); // WHy can't OldPhone or just Phone be on the right?
		sPhone.browseWeb("Google");
		sPhone.findPosition();
		sPhone.callNumber("1234567");
		sPhone.callNumber("001234567");
		sPhone.ringAlarm("tune");
		sPhone.playGame("Game");
		System.out.println(sPhone.getBrand());
//		sPhone.callNumber("1234567");
//		sPhone.callNumber("1234567");
//		sPhone.callNumber("1234567");
//		sPhone.callNumber("1234567");
//		sPhone.callNumber("1234567");
//		sPhone.printLastNumbers();
	}
}