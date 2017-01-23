public class ErrorUserInput_b{
	public static void main (String[] args){
		ErrorUserInput_b test = new ErrorUserInput_b();
		test.launch();
	}

	public void launch(){
		int count=0, temp=0;						// counter to count the values
		int[] numbers=new int[10];			// array to store values
		int avg=0;
		while (count==0){
			try{
				System.out.print("Enter number of values needed: ");
				String str = System.console().readLine();
				temp = Integer.parseInt(str);
				count=temp;
				numbers=new int[count];
			} catch (NumberFormatException e){
				System.out.println("ENTER A NUMBER!! What you entered was not a number!");
			}
		}
		while (count>0){
			try{
				System.out.print("Enter a number: ");
				String str = System.console().readLine();
				int temp1 = Integer.parseInt(str);
				numbers[count-1]=temp1;
				count--;
			} catch (NumberFormatException e){
				System.out.println("ENTER A NUMBER!! What you entered was not a number!");
			}
		}
		for (int temporary : numbers){
			avg+=temporary;
		}
		avg=avg/temp;
		System.out.println("Average is: " + avg);
	}
}