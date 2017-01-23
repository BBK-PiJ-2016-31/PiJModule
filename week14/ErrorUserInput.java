public class ErrorUserInput{
	public static void main (String[] args){
		ErrorUserInput test = new ErrorUserInput();
		test.launch();
	}

	public void launch(){
		int count=0;
		int[] numbers=new int[10];
		int avg=0;
		while (count<10){
			try{
				System.out.print("Enter a number: ");
				String str = System.console().readLine();
				int temp = Integer.parseInt(str);
				numbers[count]=temp;
				count++;
			} catch (NumberFormatException e){
				System.out.println("ENTER A NUMBER!! What you entered was not a number!");
			}
		}
		for (int temp : numbers){
			avg+=temp;
		}
		avg=avg/count;
		System.out.println("Average is: " + avg);
	}
}