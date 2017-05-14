int p1Score=0
int p2Score=0
String input
String p1
String p2
boolean invalidInput=false
boolean carryOn = true

while (carryOn) { // Carry on until one player is more than 3 points ahead
	print "Enter combination (PP, PR, PS, RP, RR, RS, SP, SR, SS: "
	input = System.console().readLine().toUpperCase()
	if ((input.length()>2) || (input.length()<2)) {			// throw error if string length is too short or too long
		println " **** String is wrong length. Only enter two digit combination **** "
		invalidInput = true									
	}
	if (!invalidInput) {									// only process data if valid
		p1 = input.substring(0,1)								// take respective characters for p1 and p2 from the input
		p2 = input.substring(1)	
		if (p1=="P" && p2=="R") { p1Score++ }				// Assign scores respectively
		if (p1=="P" && p2=="S") { p2Score++ }
		if (p1=="R" && p2=="P") { p2Score++ }
		if (p1=="R" && p2=="S") { p1Score++ }
		if (p1=="S" && p2=="P") { p1Score++ }
		if (p1=="S" && p2=="R") { p2Score++ }
	}
	invalidInput = false										// reset the inputvariable. Can use if changed condition but this should be ok as well
	println "P1 Score : " + p1Score + "  P2 Score : " + p2Score
	if ((p1Score > (p2Score+2)) || (p2Score > (p1Score+2))) { carryOn = false }
}