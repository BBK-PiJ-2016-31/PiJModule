int recent=1		// To get most recent input
int biggest=0	// to record the biggest number entered
int last=0		// To keep the last entered number
while (recent!=-1) {
	print "Please enter a number: "
	String str1 = System.console().readLine()
	recent = Integer.parseInt(str1)

	if (recent>last) { 
		biggest=recent 					// record biggest if recent is bigger than last
	}									// Will also work if recent is a -ve number
	last=recent							// Save the recent as last
}
println "Biggest number you entered is: " + biggest