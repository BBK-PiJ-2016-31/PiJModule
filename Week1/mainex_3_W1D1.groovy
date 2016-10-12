String str1 = System.console().readLine() 
int i = Integer.parseInt(str1) 	// how many number of times (upto value 9) should the loop run
while (i < 10) {
	i++;
	String str = System.console().readLine() // read string and convert it to an int
	int j = Integer.parseInt(str)
	if (j == 0) {
		break;					// finish execution, break out of while loop if 0 is entered
	} else if (j != 1) {
		println j; 				// print the entered number if it is not 1 .i.e from 2 to upto the capacity of an int variable
	}
}
System.out.println("finished");