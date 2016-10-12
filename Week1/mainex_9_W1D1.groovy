int recent=1				// To record the recent entry
boolean sequence = true		// Assume sequence will be there
boolean firstStart = true	// To record just first time in loop 
int last = 0				// To record the last entered number		
while (recent!=-1) {
	print "Please enter a number: "
	String str1 = System.console().readLine()
	recent = Integer.parseInt(str1)		// Get the number
	if (firstStart) {					// Get the starting point and never enter here again
		last=recent
		firstStart = false
	} else {
		if (recent!=(last+1) && (recent!=-1)) { // Disqualify as sequence if next number is not 1 higher than the last recorded
			sequence = false
		}
		last=recent
	}
}
String answer = sequence? "Yes" : "No"	// Load string as appropiate into answer, Yes if true and No if false
println "Sequence = " + answer
