public class SmartPhone extends MobilePhone{

	public SmartPhone (String brand) {
		super(brand);
	}

	public void browseWeb (String name){
		System.out.println("Browsing web: "+name);
	}

	public String findPosition(){
		System.out.println(("122.20009, 023.09876"));
		return ("122.20009, 023.09876");
	}

	@Override
	public void callNumber(String number){
		if (number.substring(0,2).equals("00")){
			System.out.println("Calling "+number+" through internet to save money!");
		} else {
			super.callNumber(number);
		}

	}
}