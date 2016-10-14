
print "Enter value of pi to know how many iterations it would take: "
String str = System.console().readLine()
int length = str.length()
double num = Double.parseDouble(str)			// We got the user input

int divisor=1
double result=0
boolean add = true						// to change between addition and subtraction
int counter =0 
while (result!=num){
	counter++							// keep counting how many iterations it took
	if (add){							// start by adding 4 and then subtracting the next fraction
		result = result + (4/divisor)
		add = !add						// toggles between true and false
	} else {
		result = result - (4/divisor)
		add = !add
	}
	divisor = divisor + 2
	String str1 = result.toString()		// convert result to string as we will use subtring to trim it down
	if (str1.length()>=length){			// if the length is greater than what user entered. It will not be always true
		String str2 = str1.substring(0,length)		// Create new string to trim it down to what user entered
		double num2 = Double.parseDouble(str2)		
	if (num2 == num) { break }						// compare user input with current number and get out of loop then print the result
	}
}

println str + " in pi took " + counter + " iterations"

