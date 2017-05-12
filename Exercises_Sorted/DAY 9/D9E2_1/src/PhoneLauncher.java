public class PhoneLauncher{
	public static void main (String[] args){
		PhoneLauncher launcher=new PhoneLauncher();
		launcher.launch();
	}
	public void launch(){
/*
Answer 2.2
Cannot do MobilePhone sPhone as then we can't access Smart Phone class methods!
Do get around it we need not use the SmartPhone methods and it will work.
*/
		MobilePhone sPhone = new SmartPhone("Nokia");
//		MobilePhone sPhone = new MobilePhone("Nokia");
		// Just Mobile phone object will not be casted to smartPhone
		testPhone(sPhone);
		// sPhone.browseWeb("Google");
		// sPhone.findPosition();
		// sPhone.callNumber("1234567");
		// sPhone.callNumber("001234567");
		// sPhone.ringAlarm("tune");
		// sPhone.playGame("Game");
		// System.out.println(sPhone.getBrand());
//		sPhone.callNumber("1234567");
//		sPhone.callNumber("1234567");
//		sPhone.callNumber("1234567");
//		sPhone.callNumber("1234567");
//		sPhone.callNumber("1234567");
//		sPhone.printLastNumbers();
	}
/*
	You can call any method as long as you Downcast to the class the method is in ORRRR
	you can also downcast to the SmartPhone class and access everything.

*/
	public void testPhone(Phone myPhone){ // One downcasting VS individual class downcasting
		((SmartPhone)myPhone).browseWeb("Google");
		((SmartPhone)myPhone).findPosition();
		((SmartPhone)myPhone).callNumber("1234567");
		((SmartPhone)myPhone).callNumber("001234567");
		((SmartPhone)myPhone).ringAlarm("tune");
		((SmartPhone)myPhone).playGame("Game");
		// System.out.println(myPhone.getBrand());
	}
}