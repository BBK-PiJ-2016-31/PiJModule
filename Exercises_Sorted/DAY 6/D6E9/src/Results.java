public class Results {		// no methods so keep everything public
	private int invalid=0;
	private int numberOfStudents=0;
	private int distinctions=0;
	private int passes=0;
	private int fails=0;
	
	public void getResults(){
		int getInput;
		do{
			System.out.print("Input a mark:");
			String str=System.console().readLine();
			getInput=Integer.parseInt(str);
			if ((getInput>100 || getInput<0)&& (getInput!=-1)){
				invalid++;
			} else if (getInput!=-1){
				if (getInput>=70){ distinctions++;}
				if (getInput>=50 && getInput<70){ passes++;}
				if (getInput>=0 && getInput<50){ fails++;}
 				numberOfStudents++;
			}
		} while (getInput!=-1);
		System.out.println("There are "+ numberOfStudents+" students: "+distinctions+" distinctions, "+passes+" pass, "+fails+" fails (plus "+invalid+" invalid).");
	}
}
