print "Enter your text: "
String str = System.console().readLine()

for (int i=0; i<str.length(); i++){
	char check = str.charAt(i)		// check every character from the string
	if (check==32) {				// Ascii table shows the value of space=32 in decimal
		println ""					// print next line if space is there
	} else {
		print check
	}	
}
println ""