int recent=1
boolean sequence = true
boolean firstStart = true	// to only execute a piece of code once then it shall becoe false
boolean setDirection = true	// to vaidate the direction up or down
boolean goingUp=true		// to check the direction
int last=0					// to hold the last entered value
int counter=0				// to count how many numbers are entered

while (recent != -1) {
	print "Please enter a number: "
	String str1 = System.console().readLine()
	recent = Integer.parseInt(str1)					// Get the int input format
	counter++
	if (firstStart) {								// Get the first number, a starting point
		last = recent
		firstStart = false
	} else if (setDirection) {							// execute this code once on second input
		setDirection = false
		if (recent == last+1) {						// positive increment, note direction is going up
			goingUp = true
		} else if (recent == last-1){
			goingUp = false
		} else {									// if out of sequency then just note it down
			sequence = false
		}
	} else {
		if (goingUp) {								// based on set direction, keep checking increment/decrement and the end character i.e. -1
			if (recent != (last+1) && (recent != -1)) {
				sequence = false
			}
		} else {
			if ((recent != (last-1)) && (recent != -1)) {
				sequence = false
			}
		}
	}
		last=recent
}
if (counter<3) {sequence=false}				// not enough entries are there to determine the series
String answer = sequence? "Yes" : "No"		// Load answer to be Yes or No based on sequence is true or false and print it
println "Sequence = " + answer